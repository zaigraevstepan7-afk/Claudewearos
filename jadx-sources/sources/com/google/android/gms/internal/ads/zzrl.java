package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzrl extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzrm zza;

    public zzrl(zzrm zzrmVar) {
        this.zza = zzrmVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        audioTrack.equals(this.zza.zza.zzu);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzro zzroVar = this.zza.zza;
        if (audioTrack.equals(zzroVar.zzu)) {
            zzroVar.zzR = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.zza.zza.zzu);
    }
}
