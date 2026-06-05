package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzch {
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zze zzd;
    private final Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    public zzch(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zze zzeVar, boolean z2) {
        this.zzc = handler;
        this.zzd = zzeVar;
        this.zzb = onAudioFocusChangeListener;
        this.zzf = new AudioFocusRequest.Builder(1).setAudioAttributes(zzeVar.zza().zza).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return false;
        }
        zzch zzchVar = (zzch) obj;
        return Objects.equals(this.zzb, zzchVar.zzb) && Objects.equals(this.zzc, zzchVar.zzc) && Objects.equals(this.zzd, zzchVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(1, this.zzb, this.zzc, this.zzd, Boolean.FALSE);
    }

    public final AudioFocusRequest zza() {
        Object obj = this.zzf;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    public final zze zzc() {
        return this.zzd;
    }
}
