import React from 'react';
import '../Nav.css';
import { Button } from 'react-bootstrap';
// import CustomerList from './CustomerList';
import { Link } from "react-router-dom";


// import { Button } from 'primereact/button';

function Navbar(){
    return(
        <div>
            <div className='navBar'>
                <Link to=""><Button id="homeBtn" variant="outline-secondary">Home </Button></Link>
                <Link to="CustomerList"><Button id="custBtn" variant="outline-secondary" >Customers</Button></Link>
                <Link to="transaction"><Button id="transBtn" variant="outline-secondary">Make a Transaction</Button></Link>
                <Button id="transDashBtn" variant="outline-secondary"> Transaction Dashboard</Button>
                <Button id="logoutBtn" variant="outline-danger"> Logout</Button>
                {/* <Button label="Customers" className="p-button-raised p-button-secondary p-button-text" />
                <Button label="Make a Transaction" className="p-button-raised p-button-secondary p-button-text" />
                <Button label="Transaction Dashboard" className="p-button-raised p-button-secondary p-button-text" /> */}
            </div>
        </div>
    )
}
export default Navbar;