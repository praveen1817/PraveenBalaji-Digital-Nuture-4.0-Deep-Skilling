import './App.css';
import { CalculateScore } from '../src/Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name={"PraveenBalaji S"} 
        School={"Mahendra International School"} 
        total={288} 
        goal={3} 
      />
    </div>
  );
}

export default App;
