package com.navatar.data.source;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.navatar.maps.Map;

import java.util.List;
import com.google.common.base.Optional;
import com.navatar.location.model.Geofence;

import io.reactivex.Flowable;

/**
 * @author Chris Daley
 */
public interface MapsDataSource {

    Flowable<List<Map>> getMaps();

    Flowable<Optional<Map>> getMap(@NonNull String mapId);

    Flowable<List<Geofence>> getGeofences();

    void refreshMaps();

    void saveMap(@NonNull Map map);

    void setSelectedMap(@NonNull Map map);

    @Nullable
    Map getSelectedMap();

}
