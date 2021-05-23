import { Injectable } from '@angular/core';
import { of,Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Cliente } from './cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  private urlEndPoint: string = 'http://localhost:8080/usuarios';

  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'})
  
  constructor(private http: HttpClient) { }


  create(cliente: Cliente) : Observable<any> {
    return this.http.post<Response>(this.urlEndPoint+"/crear", cliente, {headers: this.httpHeaders})
  }


  getClientes(): Observable<any> {
    return this.http.get(this.urlEndPoint+"/");
  }

  updateClients(): Observable<any> {
    return this.http.put(this.urlEndPoint+"/procesar",null, {headers: this.httpHeaders});
  }

}
 