import logo from './logo.svg';
import './App.css';
import Counter from './components/Counter';
import Counter2 from './components/Counter2';

function App() {
  return (
    <div className='flex'
    // className="text-9xl h-64 w-60 m-24 p-32 bg-slate-900 font-bold underline"
    >

      Hellow world
      <Counter></Counter>
      <Counter2></Counter2>

    </div>
  );
}

export default App;
