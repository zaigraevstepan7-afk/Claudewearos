package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzqk extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzqk(int i10, int i11, int i12, int i13, int i14, zzz zzzVar, boolean z2, Exception exc) {
        String strValueOf = String.valueOf(zzzVar);
        StringBuilder sbQ = gk.b.q("AudioTrack init failed ", i10, " Config(", i11, ", ");
        sbQ.append(i12);
        sbQ.append(", ");
        sbQ.append(i13);
        sbQ.append(", ");
        sbQ.append(i14);
        sbQ.append(") ");
        sbQ.append(strValueOf);
        sbQ.append(true != z2 ? "" : " (recoverable)");
        super(sbQ.toString(), exc);
        this.zza = i10;
        this.zzb = z2;
    }
}
