package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import ee.f;
import ee.g;
import ee.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzz {
    public final r flushLocations(p pVar) {
        return ((j0) pVar).f3557b.doWrite((m) new zzq(this, pVar));
    }

    public final Location getLastLocation(p pVar) {
        i iVar = h.f5946a;
        e0.a("GoogleApiClient parameter is required.", pVar != null);
        pVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final LocationAvailability getLocationAvailability(p pVar) {
        i iVar = h.f5946a;
        e0.a("GoogleApiClient parameter is required.", pVar != null);
        pVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final r removeLocationUpdates(p pVar, PendingIntent pendingIntent) {
        return ((j0) pVar).f3557b.doWrite((m) new zzw(this, pVar, pendingIntent));
    }

    public final r requestLocationUpdates(p pVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return ((j0) pVar).f3557b.doWrite((m) new zzu(this, pVar, locationRequest, pendingIntent));
    }

    public final r setMockLocation(p pVar, Location location) {
        return ((j0) pVar).f3557b.doWrite((m) new zzp(this, pVar, location));
    }

    public final r setMockMode(p pVar, boolean z2) {
        return ((j0) pVar).f3557b.doWrite((m) new zzo(this, pVar, z2));
    }

    public final r removeLocationUpdates(p pVar, f fVar) {
        return ((j0) pVar).f3557b.doWrite((m) new zzn(this, pVar, fVar));
    }

    public final r requestLocationUpdates(p pVar, LocationRequest locationRequest, f fVar, Looper looper) {
        return ((j0) pVar).f3557b.doWrite((m) new zzt(this, pVar, locationRequest, fVar, looper));
    }

    public final r removeLocationUpdates(p pVar, g gVar) {
        return ((j0) pVar).f3557b.doWrite((m) new zzv(this, pVar, gVar));
    }

    public final r requestLocationUpdates(p pVar, LocationRequest locationRequest, g gVar) {
        e0.j(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return ((j0) pVar).f3557b.doWrite((m) new zzr(this, pVar, locationRequest, gVar));
    }

    public final r requestLocationUpdates(p pVar, LocationRequest locationRequest, g gVar, Looper looper) {
        return ((j0) pVar).f3557b.doWrite((m) new zzs(this, pVar, locationRequest, gVar, looper));
    }
}
