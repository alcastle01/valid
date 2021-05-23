import { Component, OnInit } from '@angular/core';

import {ClienteService} from './cliente.service'
import {Cliente} from './cliente'
import { tap } from 'rxjs/operators';
import { map } from 'rxjs/operators';
@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[];
  constructor(private clienteService: ClienteService) { }

  ngOnInit() {
    this.clienteService.getClientes().subscribe((clientes: any) => { console.log(this.clientes = clientes.clientes); this.clientes = clientes.clientes });
  }

}
