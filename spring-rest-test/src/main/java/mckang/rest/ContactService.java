package mckang.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mckang.rest.dao.ContactDao;
import mckang.rest.model.ContactVo;

 

@Path("/contact")

public class ContactService {

        static ContactDao dao = null;

        public void setContactDao(ContactDao dao){this.dao = dao;}

        public ContactService(){

               //if(dao == null)      setContactDao(new ContactDao());

        }

        

        /**

         * Create Contact Record

         * @param contact

         * @return

         */

        @POST

        @Consumes(MediaType.APPLICATION_JSON)

        public Response create(ContactVo contact){

               dao.create(contact);

               return Response.status(200).entity(contact).build();

 

        }

        /**

         * Query Contact record by email id

         * @param email

         * @return

         */

        @GET

        @Produces(MediaType.APPLICATION_JSON)

        @Path("{email}")

        public ContactVo get(@PathParam("email") String email){

               return dao.get(email);

        }

        /**

         * Upadte Contact Record by email

         * @param email

         * @param contact

         * @return

         */

        @PUT

        @Path("{email}")

        @Consumes(MediaType.APPLICATION_JSON)

        @Produces(MediaType.APPLICATION_JSON)

        public Response  update(@PathParam("email") String email, ContactVo contact){

               dao.update(email, contact);

               return Response.status(200).entity(contact).build();

        }

}

