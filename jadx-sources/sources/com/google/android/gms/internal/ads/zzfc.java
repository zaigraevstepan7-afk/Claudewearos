package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfc extends zzff {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfc(int i10, long j) {
        super(i10, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzff
    public final String toString() {
        List list = this.zzb;
        return zzff.zze(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzfc zza(int i10) {
        List list = this.zzc;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfc zzfcVar = (zzfc) list.get(i11);
            if (zzfcVar.zzd == i10) {
                return zzfcVar;
            }
        }
        return null;
    }

    public final zzfd zzb(int i10) {
        List list = this.zzb;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfd zzfdVar = (zzfd) list.get(i11);
            if (zzfdVar.zzd == i10) {
                return zzfdVar;
            }
        }
        return null;
    }

    public final void zzc(zzfc zzfcVar) {
        this.zzc.add(zzfcVar);
    }

    public final void zzd(zzfd zzfdVar) {
        this.zzb.add(zzfdVar);
    }
}
