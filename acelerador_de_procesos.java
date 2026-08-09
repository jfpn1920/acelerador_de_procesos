import java.util.Scanner;
public class acelerador_de_procesos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[10];
        String[] descripciones = new String[10];
        String[] prioridades = new String[10];
        int[] tiempos = new int[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //----------------------------------------------//
        //--|menu_principal_de_acelerador_de_procesos|--//
        //----------------------------------------------//
        do {
            System.out.println("menu principal de acelerador de procesos");
            System.out.println("1) Registrar proceso");
            System.out.println("2) Editar proceso");
            System.out.println("3) Listar procesos");
            System.out.println("4) Buscar proceso");
            System.out.println("5) Eliminar proceso");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_proceso|--//
                //-----------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del proceso");
                    System.out.println("id del proceso a registrar: " + id);
                    System.out.print("nombre del proceso: ");
                    nombres[total] = entrada.nextLine();
                    System.out.print("descripcion del proceso: ");
                    descripciones[total] = entrada.nextLine();
                    System.out.print("prioridad del proceso: ");
                    prioridades[total] = entrada.nextLine();
                    System.out.print("tiempo estimado en minutos: ");
                    tiempos[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("estado del proceso: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Proceso registrado correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_proceso|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen procesos registrados.");
                        break;
                    }
                    System.out.println("Datos de los procesos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Descripcion: " + descripciones[i] + " | Prioridad: " + prioridades[i] + " | Tiempo: " + tiempos[i] + " minutos | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del proceso: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del proceso");
                        System.out.print("Nuevo nombre: ");
                        nombres[posicion] = entrada.nextLine();
                        System.out.print("Nueva descripcion: ");
                        descripciones[posicion] = entrada.nextLine();
                        System.out.print("Nueva prioridad: ");
                        prioridades[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tiempo estimado en minutos: ");
                        tiempos[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Proceso actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_procesos|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen procesos registrados.");
                    } else {
                        System.out.println("Lista de procesos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Descripcion: " + descripciones[i] + " | Prioridad: " + prioridades[i] + " | Tiempo: " + tiempos[i] + " minutos | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_proceso|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen procesos registrados.");
                        break;
                    }
                    System.out.println("busqueda de proceso");
                    System.out.print("ingresa la id para buscar proceso: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del proceso encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Nombre: " + nombres[posicion] + " | Descripcion: " + descripciones[posicion] + " | Prioridad: " + prioridades[posicion] + " | Tiempo: " + tiempos[posicion] + " minutos | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_proceso|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen procesos registrados.");
                        break;
                    }
                    System.out.println("Datos de los procesos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Descripcion: " + descripciones[i] + " | Prioridad: " + prioridades[i] + " | Tiempo: " + tiempos[i] + " minutos | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del proceso a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombres[i] = nombres[i + 1];
                            descripciones[i] = descripciones[i + 1];
                            prioridades[i] = prioridades[i + 1];
                            tiempos[i] = tiempos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Proceso eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Acelerador de Procesos.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}