package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbqg implements tc.d {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final boolean zzg;

    public zzbqg(Date date, int i10, Set set, Location location, boolean z2, int i11, boolean z10, int i12, String str) {
        this.zza = date;
        this.zzb = i10;
        this.zzc = set;
        this.zze = location;
        this.zzd = z2;
        this.zzf = i11;
        this.zzg = z10;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // tc.d
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // tc.d
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    @Override // tc.d
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // tc.d
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}
