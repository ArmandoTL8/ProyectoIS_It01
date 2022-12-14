import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ProductosComponent } from './productos/productos.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormComponent as ProductoFormComponent} from './productos/form.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './usuarios/login.component';
import { FormComponent as UsuarioFormComponent}  from './usuarios/form.component';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { VistausuariosComponent } from './usuarios/vistausuarios.component';
import { FormComponent as RentarFormComponent} from './rentar/form.component';
import { RentarComponent } from './rentar/rentar.component';

const routes: Routes = [
  { path: '', redirectTo: '/', pathMatch: 'full' },
  { path: 'productos', component: ProductosComponent },
  { path: 'productos/form', component: ProductoFormComponent },
  { path: 'productos/form/:id', component: ProductoFormComponent },
  
  { path: 'login', component: LoginComponent },
  { path: 'usuarios', component: UsuariosComponent },
  { path: 'usuarios/form', component: UsuarioFormComponent },
  { path: 'usuarios/form/:id', component: UsuarioFormComponent },
  { path: 'usuarios/:id', component: VistausuariosComponent},
  { path: 'rentar', component: RentarComponent },
  { path: 'rentar/form', component: RentarFormComponent },
  { path: 'rentar/form/:id', component: RentarFormComponent },
];
/**
 * Para poner las rutas que vamos a utilizar
 */
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ProductosComponent,
    UsuarioFormComponent,
    ProductoFormComponent,
    LoginComponent,
    UsuariosComponent,
    VistausuariosComponent,
    RentarFormComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
