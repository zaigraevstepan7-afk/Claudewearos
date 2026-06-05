package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.location.LocationAvailability;
import ee.c;
import ee.e;
import ee.i;
import ee.l;
import ee.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzal extends zza implements zzam {
    public zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzd(e eVar, PendingIntent pendingIntent, zzak zzakVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, eVar);
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, zzakVar);
        zzx(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zze(PendingIntent pendingIntent, zzak zzakVar, String str) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, zzakVar);
        parcelZza.writeString(str);
        zzx(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzf(String[] strArr, zzak zzakVar, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        zzc.zzd(parcelZza, zzakVar);
        parcelZza.writeString(str);
        zzx(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzg(z zVar, zzak zzakVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zVar);
        zzc.zzd(parcelZza, zzakVar);
        zzx(74, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzh(long j, boolean z2, PendingIntent pendingIntent) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc.zza(parcelZza, true);
        zzc.zzc(parcelZza, pendingIntent);
        zzx(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzi(c cVar, PendingIntent pendingIntent, j jVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, cVar);
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, jVar);
        zzx(72, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzj(PendingIntent pendingIntent, j jVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, jVar);
        zzx(73, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzk(PendingIntent pendingIntent) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzx(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzl(PendingIntent pendingIntent, j jVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, jVar);
        zzx(69, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final Location zzm() {
        Parcel parcelZzw = zzw(7, zza());
        Location location = (Location) zzc.zzb(parcelZzw, Location.CREATOR);
        parcelZzw.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final Location zzn(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzw = zzw(80, parcelZza);
        Location location = (Location) zzc.zzb(parcelZzw, Location.CREATOR);
        parcelZzw.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzo(zzbc zzbcVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzbcVar);
        zzx(59, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzp(boolean z2) {
        Parcel parcelZza = zza();
        zzc.zza(parcelZza, z2);
        zzx(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzq(Location location) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, location);
        zzx(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzr(zzai zzaiVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzaiVar);
        zzx(67, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final LocationAvailability zzs(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzw = zzw(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zzb(parcelZzw, LocationAvailability.CREATOR);
        parcelZzw.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzt(i iVar, zzao zzaoVar, String str) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, iVar);
        zzc.zzd(parcelZza, zzaoVar);
        parcelZza.writeString(null);
        zzx(63, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzu(zzl zzlVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzlVar);
        zzx(75, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzv(PendingIntent pendingIntent, l lVar, j jVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, lVar);
        zzc.zzd(parcelZza, jVar);
        zzx(79, parcelZza);
    }
}
