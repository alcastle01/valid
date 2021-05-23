import { Component, OnInit } from '@angular/core';
import {Cliente} from './cliente'

import {ClienteService} from './cliente.service'
import swal from 'sweetalert2'

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  public response: Response = new Response()
  public cliente: Cliente = new Cliente()

  constructor(private clienteService: ClienteService) { }

  ngOnInit(): void {
  }

  create(): void {
    this.clienteService.create(this.cliente)
      .subscribe(response => {
        swal.fire('Se ha registrado', ` Exitosamente`, 'success')
      }
      );
  }

  update(): void {
    this.clienteService.updateClients()
      .subscribe(response => {
        swal.fire('Procesados', ` Exitosamente`, 'success')
      }
      );
  }
}
