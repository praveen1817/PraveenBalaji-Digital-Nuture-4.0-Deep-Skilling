import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 88 },
    { name: "Dhoni", score: 92 },
    { name: "Rahul", score: 45 },
    { name: "Jadeja", score: 60 },
    { name: "Hardik", score: 30 },
    { name: "Bumrah", score: 85 },
    { name: "Shami", score: 20 },
    { name: "Ashwin", score: 71 },
    { name: "Pant", score: 65 },
    { name: "Surya", score: 99 }
  ];

  const playerList = players.map((player, index) => (
    <li key={index}>{player.name} - {player.score}</li>
  ));

  const lowScorers = players.filter(p => p.score < 70).map((p, index) => (
    <li key={index}>{p.name} - {p.score}</li>
  ));

  return (
    <div>
      <h2>All Players</h2>
      <ul>{playerList}</ul>
      <h2>Players with score below 70</h2>
      <ul>{lowScorers}</ul>
    </div>
  );
};

export default ListofPlayers;
