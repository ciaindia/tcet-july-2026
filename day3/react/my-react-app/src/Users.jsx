//https://api.github.com/users

import { useEffect, useState } from "react";

//Read data from github users api and show in listing

function Users() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch("https://api.github.com/users")
      .then((response) => response.json())
      .then((data) => {
        setUsers(data);
      })
  }, []);

  return (
    <>
      <h1>
        Hello From Users Component
     </h1>
     <ul>
      {users.map((user) => (<div>
        <li key={user.id}>{user.login}</li>
        <li><img src={user.avatar_url} alt={user.login} /></li>
      </div>
      ))}
     </ul>
    </>
  )
}

export default Users