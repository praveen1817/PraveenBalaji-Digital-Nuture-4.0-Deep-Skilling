import React from "react";

const OddPlayers = ({ players }) => {
  const [first,, third,, fifth] = players;

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>First: {first}</li>
        <li>Third: {third}</li>
        <li>Fifth: {fifth}</li>
      </ul>
    </div>
  );
};

const EvenPlayers = ({ players }) => {
  const [, second,, fourth,, sixth] = players;

  return (
    <div>
      <h2>Even Team Players</h2>
      <ul>
        <li>Second: {second}</li>
        <li>Fourth: {fourth}</li>
        <li>Sixth: {sixth}</li>
      </ul>
    </div>
  );
};


const IndianPlayers = () => {
  const allPlayers = ["Virat", "Rohit", "Dhoni", "Hardik", "Jadeja", "Bumrah"];
  const T20Players = ["Gill", "Pant"];
  const RanjiTrophyPlayers = ["Rahane", "Pujara"];
  const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <OddPlayers players={allPlayers} />
      <EvenPlayers players={allPlayers} />


      <h2>Merged T20 + Ranji Trophy Players</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
