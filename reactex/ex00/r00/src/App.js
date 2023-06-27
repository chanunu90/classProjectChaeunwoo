import logo from './logo.svg';
import './App.css';
import HelloWorld from './components/HelloWorld';
import HelloWorld2 from './components/HelloWorld2';
import LoopEx2 from './components/LoopEx2';
import ProductList from './components/products/ProductList';
import ProductImage from './components/products/ProductImage';


function App() {

  const products = [
    {pno :1, pname:'상품1' , price: 3000},
    {pno :2, pname:'상품3' , price: 5000},
    {pno :3, pname:'상품5' , price: 7000},
  ]

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <ProductList/>
      </header>
    </div>
  );
}

export default App;
