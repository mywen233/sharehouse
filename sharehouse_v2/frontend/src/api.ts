const fetchWithBase = async (url: string, options: RequestInit = {}) => {
  const response = await fetch(url, options)
  if (!response.ok) {
    throw new Error(`HTTP error! status: ${response.status}`)
  }
  return response.json()
}

export const api = {
  get: (url: string) => fetchWithBase(url),
  post: (url: string, data: any) => fetchWithBase(url, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(data),
  }),
}
