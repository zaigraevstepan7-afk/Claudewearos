package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzrh {
    private final AudioTrack zza;
    private final zzpo zzb;
    private AudioRouting.OnRoutingChangedListener zzc = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzrg
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzrh.zza(this.zza, audioRouting);
        }
    };

    public zzrh(AudioTrack audioTrack, zzpo zzpoVar) {
        this.zza = audioTrack;
        this.zzb = zzpoVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void zza(zzrh zzrhVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zzrhVar.zzc == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        zzrhVar.zzb.zzh(routedDevice);
    }

    public final void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
