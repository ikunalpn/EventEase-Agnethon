import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  counters!: NodeListOf<HTMLDivElement>;
  speed = 200;

  ngOnInit() {
    this.counters = document.querySelectorAll<HTMLDivElement>(".count");

    this.counters.forEach((counter) => {
      const updateCount = () => {
        const target = parseInt(counter.getAttribute("data-target") || "0", 10);
        const count = parseInt(counter.innerText, 10);
        const increment = Math.trunc(target / this.speed);

        if (count < target) {
          counter.innerText = (count + increment).toString();
          setTimeout(updateCount, 1);
        } else {
          counter.innerText = target.toString();
        }
      };
      updateCount();
    });
  }
}
