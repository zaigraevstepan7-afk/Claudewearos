package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzpk extends AudioDeviceCallback {
    final /* synthetic */ zzpo zza;

    public /* synthetic */ zzpk(zzpo zzpoVar, zzpn zzpnVar) {
        this.zza = zzpoVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpo zzpoVar = this.zza;
        zzpoVar.zzj(zzpj.zzc(zzpoVar.zza, zzpoVar.zzh, zzpoVar.zzg));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpo zzpoVar = this.zza;
        zzpp zzppVar = zzpoVar.zzg;
        String str = zzex.zza;
        int length = audioDeviceInfoArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i10], zzppVar)) {
                zzpoVar.zzg = null;
                break;
            }
            i10++;
        }
        zzpoVar.zzj(zzpj.zzc(zzpoVar.zza, zzpoVar.zzh, zzpoVar.zzg));
    }
}
