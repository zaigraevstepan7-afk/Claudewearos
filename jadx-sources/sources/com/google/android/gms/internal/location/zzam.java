package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.location.LocationAvailability;
import ee.c;
import ee.e;
import ee.i;
import ee.l;
import ee.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public interface zzam extends IInterface {
    void zzd(e eVar, PendingIntent pendingIntent, zzak zzakVar);

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str);

    void zzf(String[] strArr, zzak zzakVar, String str);

    void zzg(z zVar, zzak zzakVar);

    void zzh(long j, boolean z2, PendingIntent pendingIntent);

    void zzi(c cVar, PendingIntent pendingIntent, j jVar);

    void zzj(PendingIntent pendingIntent, j jVar);

    void zzk(PendingIntent pendingIntent);

    void zzl(PendingIntent pendingIntent, j jVar);

    @Deprecated
    Location zzm();

    Location zzn(String str);

    void zzo(zzbc zzbcVar);

    void zzp(boolean z2);

    void zzq(Location location);

    void zzr(zzai zzaiVar);

    LocationAvailability zzs(String str);

    void zzt(i iVar, zzao zzaoVar, String str);

    void zzu(zzl zzlVar);

    void zzv(PendingIntent pendingIntent, l lVar, j jVar);
}
