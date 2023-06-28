import Counter from "./components/Counter";
import Counter2 from "./components/Counter2";
import Kiosk from "./components/Kiosk";

function App() {
  return (
    <div className="bg-stone-950">
      <div className="w-full h-24 text-zinc-50 border-b-2 border-cyan-50 ">
          <img className="w-20 h-20 m-auto pt-3" src="coffe.png" />
      </div>  
      <Kiosk></Kiosk>

    </div>
  );
}

export default App;
