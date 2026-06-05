package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.e0;
import ee.d;
import ee.e;
import ee.z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaf {
    @Deprecated
    public final r addGeofences(p pVar, List<d> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (d dVar : list) {
                if (dVar != null) {
                    e0.a("Geofence must be created using Geofence.Builder.", dVar instanceof zzbe);
                    arrayList.add((zzbe) dVar);
                }
            }
        }
        e0.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return ((j0) pVar).f3557b.doWrite((m) new zzac(this, pVar, new e(arrayList, 5, "", null), pendingIntent));
    }

    public final r removeGeofences(p pVar, PendingIntent pendingIntent) {
        e0.j(pendingIntent, "PendingIntent can not be null.");
        return zza(pVar, new z(null, pendingIntent, ""));
    }

    public final r zza(p pVar, z zVar) {
        return ((j0) pVar).f3557b.doWrite((m) new zzad(this, pVar, zVar));
    }

    public final r removeGeofences(p pVar, List<String> list) {
        e0.j(list, "geofence can't be null.");
        e0.a("Geofences must contains at least one id.", !list.isEmpty());
        return zza(pVar, new z(list, null, ""));
    }

    public final r addGeofences(p pVar, e eVar, PendingIntent pendingIntent) {
        return ((j0) pVar).f3557b.doWrite((m) new zzac(this, pVar, eVar, pendingIntent));
    }
}
