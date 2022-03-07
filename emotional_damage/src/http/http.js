import axios from 'axios'

export function getRequest (url, data) {
  return axios.get(url, data)
}
export function postRequest (url, data) {
  return axios.post(url, data)
};
export function deleteRequest (url, data) {
  return axios.delete(url, data)
};
export function putRequest (url, data) {
  return axios.put(url, data)
};
