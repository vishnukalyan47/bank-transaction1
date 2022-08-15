import './App.css';
import Navbar from './components/Navbar';
import CustomerList from './components/CustomerList';



import {
  Routes,
  Route,
} from "react-router-dom";
import Transaction from './components/Transaction';

function App() {
  return (
    <div className="App">

      <Navbar/>

      <Routes>
        <Route path="CustomerList" element={<CustomerList/>}></Route>
        <Route path="transaction" element={<Transaction/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
