package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import ee.c;
import ee.c0;
import ee.z;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, n nVar, o oVar, String str, i iVar) {
        super(context, looper, nVar, oVar, str, iVar);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e10) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e10);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, com.google.android.gms.common.api.internal.o oVar, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, oVar, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, com.google.android.gms.common.api.internal.o oVar, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, oVar, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(m mVar, zzai zzaiVar) {
        this.zzf.zzh(mVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(m mVar, zzai zzaiVar) {
        this.zzf.zzi(mVar, zzaiVar);
    }

    public final void zzI(boolean z2) {
        this.zzf.zzk(z2);
    }

    public final void zzJ(Location location) {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(ee.i iVar, e eVar, String str) {
        checkConnected();
        e0.a("locationSettingsRequest can't be null nor empty.", iVar != null);
        e0.a("listener can't be null.", eVar != null);
        ((zzam) getService()).zzt(iVar, new zzay(eVar), null);
    }

    public final void zzq(long j, PendingIntent pendingIntent) {
        checkConnected();
        e0.i(pendingIntent);
        e0.a("detectionIntervalMillis must be >= 0", j >= 0);
        ((zzam) getService()).zzh(j, true, pendingIntent);
    }

    public final void zzr(c cVar, PendingIntent pendingIntent, e eVar) {
        checkConnected();
        e0.j(cVar, "activityTransitionRequest must be specified.");
        e0.j(pendingIntent, "PendingIntent must be specified.");
        e0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzi(cVar, pendingIntent, new u(eVar));
    }

    public final void zzs(PendingIntent pendingIntent, e eVar) {
        checkConnected();
        e0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new u(eVar));
    }

    public final void zzt(PendingIntent pendingIntent) {
        checkConnected();
        e0.i(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, e eVar) {
        checkConnected();
        e0.j(pendingIntent, "PendingIntent must be specified.");
        e0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new u(eVar));
    }

    public final void zzv(ee.e eVar, PendingIntent pendingIntent, e eVar2) {
        checkConnected();
        e0.j(eVar, "geofencingRequest can't be null.");
        e0.j(pendingIntent, "PendingIntent must be specified.");
        e0.j(eVar2, "ResultHolder not provided.");
        ((zzam) getService()).zzd(eVar, pendingIntent, new zzaw(eVar2));
    }

    public final void zzw(z zVar, e eVar) {
        checkConnected();
        e0.j(zVar, "removeGeofencingRequest can't be null.");
        e0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzg(zVar, new zzax(eVar));
    }

    public final void zzx(PendingIntent pendingIntent, e eVar) {
        checkConnected();
        e0.j(pendingIntent, "PendingIntent must be specified.");
        e0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(eVar), getContext().getPackageName());
    }

    public final void zzy(List<String> list, e eVar) {
        checkConnected();
        e0.a("geofenceRequestIds can't be null nor empty.", list != null && list.size() > 0);
        e0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(eVar), getContext().getPackageName());
    }

    public final Location zzz(String str) {
        return ud.c.e(getAvailableFeatures(), c0.f5940a) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}
