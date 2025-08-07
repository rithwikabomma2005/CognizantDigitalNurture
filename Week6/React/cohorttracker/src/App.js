import React from 'react';
import CohortDetails from './components/CohortDetails';

const cohorts = [
  {
    name: "INTADMDF10 -.NET FSD",
    startDate: "22-Feb-2022",
    status: "Scheduled",
    coach: "Naveen",
    trainer: "Rithwika"
  },
  {
    name: "ADM21JF014 - Java FSD",
    startDate: "10-Sep-2021",
    status: "Ongoing",
    coach: "Supraja",
    trainer: "Lakshman"
  },
  {
    name: "CDBJF21025 - Java FSD",
    startDate: "24-Dec-2021",
    status: "Ongoing",
    coach: "Naveen",
    trainer: "Kushal"
  }
];

function App() {
  return (
    <div>
      <h1>Cohorts Details</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
