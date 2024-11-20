package vertx.mongodb.effect;


import com.mongodb.client.MongoCollection;
import io.vertx.core.DeploymentOptions;
import jsonvalues.JsObj;
import vertx.effect.VertxModule;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public abstract class MongoModule extends VertxModule {

    public final Supplier<MongoCollection<JsObj>> collectionSupplier;

    /**
     * Creates a new mongo module.
     *
     * @param collectionSupplier the mongo collection supplier
     * @param deploymentOptions  the verticles deployment options
     */
    public MongoModule(final Supplier<MongoCollection<JsObj>> collectionSupplier,
                       final DeploymentOptions deploymentOptions
                      ) {
        super(deploymentOptions);
        this.collectionSupplier = requireNonNull(collectionSupplier);
    }


}
