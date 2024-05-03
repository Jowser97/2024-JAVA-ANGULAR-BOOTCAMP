use pruebaBiblioteca
db.createCollection('comic')

db.comic.insertOne(
    {
        _id: 1,
        titulo: 'Yotsuba to!',
        fecha_lanzamiento: '2003',
        autor: 'Kiyohiko Azuma',
        categoria: 'comedia',
        editorial: 'Norma Comics',
        idioma: 'Japones',
        paginas: 192,
        descripcion: 'La trama se centra en las aventuras y travesuras de Yotsuba Koiwai, una niña adoptada de cinco años de edad, que es enérgica, alegre, curiosa, rara y peculiar. Además, no conoce cosas que cualquier niña de su edad debería saber, como los timbres y los columpios.'
    }
)