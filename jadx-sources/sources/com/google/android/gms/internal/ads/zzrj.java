package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzrj implements zzqr {
    final /* synthetic */ zzro zza;

    public /* synthetic */ zzrj(zzro zzroVar, zzrn zzrnVar) {
        this.zza = zzroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zza(long j) {
        zzea.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zzb(long j) {
        zzro zzroVar = this.zza;
        if (zzroVar.zzq != null) {
            ((zzrs) zzroVar.zzq).zza.zzc.zzx(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zzc(long j, long j4, long j10, long j11) {
        zzro zzroVar = this.zza;
        long jZzL = zzroVar.zzL();
        long jZzM = zzroVar.zzM();
        StringBuilder sbL = m1.l("Spurious audio timestamp (frame position mismatch): ", ", ", j);
        sbL.append(j4);
        sbL.append(", ");
        sbL.append(j10);
        sbL.append(", ");
        sbL.append(j11);
        sbL.append(", ");
        sbL.append(jZzL);
        sbL.append(", ");
        sbL.append(jZzM);
        zzea.zzf("DefaultAudioSink", sbL.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zzd(long j, long j4, long j10, long j11) {
        zzro zzroVar = this.zza;
        long jZzL = zzroVar.zzL();
        long jZzM = zzroVar.zzM();
        StringBuilder sbL = m1.l("Spurious audio timestamp (system clock mismatch): ", ", ", j);
        sbL.append(j4);
        sbL.append(", ");
        sbL.append(j10);
        sbL.append(", ");
        sbL.append(j11);
        sbL.append(", ");
        sbL.append(jZzL);
        sbL.append(", ");
        sbL.append(jZzM);
        zzea.zzf("DefaultAudioSink", sbL.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zze(int i10, long j) {
        zzro zzroVar = this.zza;
        if (zzroVar.zzq != null) {
            ((zzrs) zzroVar.zzq).zza.zzc.zzz(i10, j, SystemClock.elapsedRealtime() - zzroVar.zzW);
        }
    }
}
