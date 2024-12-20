import { useParams } from "react-router-dom";

const UserDetails = () => {
  const { userId } = useParams();

  return (
    <div style={{ textAlign: "center" }}>
      <h1>Details About User {userId}</h1>
    </div>
  );
};

export default UserDetails;
