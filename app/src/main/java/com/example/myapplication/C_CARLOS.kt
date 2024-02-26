package com.example.myapplication


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class C_CARLOS(var context: Context,
               var ListaCliente: MutableList<DT_CARLOS>) : RecyclerView.Adapter<C_CARLOS.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtnombre: TextView
        init {
            txtnombre=itemView.findViewById(R.id.txtNombre)
        }
        lateinit var txtcorreo: TextView
        init {
            txtcorreo=itemView.findViewById(R.id.txtcorreo)
        }
        lateinit var txttelefono: TextView
        init {
            txttelefono=itemView.findViewById(R.id.txttelefono)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): C_CARLOS.vHolder {
        var itemView = LayoutInflater.from(context).inflate(
            R.layout.vista_producto,parent,false)

        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaCliente.size
    }

    override fun onBindViewHolder(holder: C_CARLOS.vHolder, position: Int) {
        var clientes= ListaCliente[position]
        holder.txtnombre.text=clientes.Nombre
        holder.txtcorreo.text=clientes.Correo
        holder.txttelefono.text=clientes.Telefono
    }

}