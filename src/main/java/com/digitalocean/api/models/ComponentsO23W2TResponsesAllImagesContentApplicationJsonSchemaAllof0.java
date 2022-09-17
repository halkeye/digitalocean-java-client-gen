package com.digitalocean.api.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0 model. */
@Fluent
public class ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0 {
    /*
     * The images property.
     */
    @JsonProperty(value = "images", required = true)
    private List<Image> images;

    /**
     * Get the images property: The images property.
     *
     * @return the images value.
     */
    public List<Image> getImages() {
        return this.images;
    }

    /**
     * Set the images property: The images property.
     *
     * @param images the images value to set.
     * @return the ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0 object itself.
     */
    public ComponentsO23W2TResponsesAllImagesContentApplicationJsonSchemaAllof0 setImages(List<Image> images) {
        this.images = images;
        return this;
    }
}
