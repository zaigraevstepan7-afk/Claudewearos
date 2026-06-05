package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeh extends zzej {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzeh(byte[] bArr, int i10, int i11, boolean z2, zzeg zzegVar) {
        super(null);
        this.zze = f.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i10) {
        int i11 = this.zze;
        this.zze = 0;
        int i12 = this.zzc + this.zzd;
        this.zzc = i12;
        if (i12 <= 0) {
            this.zzd = 0;
            return i11;
        }
        this.zzd = i12;
        this.zzc = 0;
        return i11;
    }
}
