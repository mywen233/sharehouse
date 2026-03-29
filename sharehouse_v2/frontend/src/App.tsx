import { useState, useEffect } from 'react'
import './App.css'
import { api } from './api'

function App() {
  const [activeTab, setActiveTab ] = useState('marketplace')
  
  // Real State for Marketplace
  const [items, setItems] = useState<any[]>([])
  const [newItemTitle, setNewItemTitle] = useState('')
  const [newItemPrice, setNewItemPrice] = useState('')

  // Real State for Messages
  const [chats, setChats] = useState<any[]>([])
  const [newMsg, setNewMsg] = useState('')

  const fetchItems = async () => {
    try {
      const data = await api.get('/api/goods')
      setItems(data)
    } catch (err) {
      console.error('Failed to fetch items:', err)
      setItems([
        { id: 1, goods: '📚 Calculus Textbook (Mock)', price: 35 },
        { id: 2, goods: '🚲 Vintage Bicycle (Mock)', price: 120 }
      ])
    }
  }

  const fetchMessages = async () => {
    try {
      const data = await api.get('/api/messages/private')
      setChats(data)
    } catch (err) {
      console.error('Failed to fetch messages:', err)
      setChats([
        { id: 1, sender: 'Alice (Mock)', text: 'Hey, is the bicycle still available?' }
      ])
    }
  }

  useEffect(() => {
    if (activeTab === 'marketplace') {
      fetchItems()
    } else if (activeTab === 'messages') {
      fetchMessages()
    }
  }, [activeTab])

  const handleAddItem = async (e: React.FormEvent) => {
    e.preventDefault()
    if (!newItemTitle || !newItemPrice) return
    try {
      await api.post('/api/goods', { 
        goods: newItemTitle, 
        price: Number(newItemPrice), 
        userid: 1, 
        type: 'idle',
        reward: 0,
        is_shared: 'no'
      })
      setNewItemTitle('')
      setNewItemPrice('')
      fetchItems()
    } catch (err) {
      console.error('Failed to add item:', err)
    }
  }

  const handleSendMsg = async (e: React.FormEvent) => {
    e.preventDefault()
    if (!newMsg) return
    try {
      await api.post('/api/messages/private', { content: newMsg, receiverId: 1 })
      setNewMsg('')
      fetchMessages()
    } catch (err) {
      console.error('Failed to send message:', err)
    }
  }

  return (
    <div className="dashboard-container">
      <aside className="sidebar">
        <div className="logo-section">
          <h2>ShareHouse v2</h2>
        </div>
        <nav className="nav-menu">
          <button className={activeTab === 'marketplace' ? 'active' : ''} onClick={() => setActiveTab('marketplace')}>📦 Marketplace</button>
          <button className={activeTab === 'messages' ? 'active' : ''} onClick={() => setActiveTab('messages')}>💬 Messages</button>
          <button className={activeTab === 'profile' ? 'active' : ''} onClick={() => setActiveTab('profile')}>👤 Profile</button>
        </nav>
      </aside>
      
      <main className="main-content">
        <header className="top-nav">
          <h3>{activeTab.toUpperCase()}</h3>
          <div className="user-badge">Admin</div>
        </header>

        <section className="scroll-content">
          {activeTab === 'marketplace' && (
            <div className="glass-card">
              <h4>Browse Marketplace</h4>
              <div className="grid-list">
                {items.length === 0 ? (
                  <p>No items found. Add one below!</p>
                ) : (
                  items.map(item => (
                    <div key={item.id} className="grid-item">
                      <h5>{item.goods}</h5>
                      <span className="price">${item.price}</span>
                    </div>
                  ))
                )}
              </div>

              <div className="form-section">
                <h5>Publish New Item</h5>
                <form onSubmit={handleAddItem} className="horizontal-form">
                  <input type="text" placeholder="Title..." value={newItemTitle} onChange={e => setNewItemTitle(e.target.value)} />
                  <input type="number" placeholder="Price ($)..." value={newItemPrice} onChange={e => setNewItemPrice(e.target.value)} />
                  <button type="submit">Publish</button>
                </form>
              </div>
            </div>
          )}

          {activeTab === 'messages' && (
            <div className="glass-card">
              <h4>Direct Messages</h4>
              <div className="chat-list">
                {chats.length === 0 ? (
                  <p>No messages found. Start a conversation!</p>
                ) : (
                  chats.map(chat => (
                    <div key={chat.id} className="chat-bubble">
                      <strong>{chat.sender || 'Unknown'}: </strong> {chat.content || chat.text}
                    </div>
                  ))
                )}
              </div>

              <div className="form-section">
                <form onSubmit={handleSendMsg} className="horizontal-form">
                  <input type="text" placeholder="Type a message..." value={newMsg} onChange={e => setNewMsg(e.target.value)} />
                  <button type="submit">Send</button>
                </form>
              </div>
            </div>
          )}

          {activeTab === 'profile' && (
            <div className="glass-card">
              <h4>Account Settings</h4>
              <p>Username: Admin User</p>
              <p>Email: admin@example.com</p>
            </div>
          )}
        </section>
      </main>
    </div>
  )
}

export default App



