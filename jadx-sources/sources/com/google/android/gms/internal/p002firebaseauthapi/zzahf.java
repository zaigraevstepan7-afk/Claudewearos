package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzahf;
import com.google.android.gms.internal.p002firebaseauthapi.zzahh;
import java.io.IOException;
import java.io.OutputStream;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzahf<MessageType extends zzahf<MessageType, BuilderType>, BuilderType extends zzahh<MessageType, BuilderType>> implements zzakp {
    protected int zza = 0;

    public final byte[] a_() {
        try {
            byte[] bArr = new byte[zzl()];
            zzaim zzaimVarZzb = zzaim.zzb(bArr);
            zza(zzaimVarZzb);
            zzaimVarZzb.zzb();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(m1.j("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public int zza(zzalh zzalhVar) {
        int iZzi = zzi();
        if (iZzi != -1) {
            return iZzi;
        }
        int iZza = zzalhVar.zza(this);
        zzb(iZza);
        return iZza;
    }

    public void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    public int zzi() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakp
    public final zzaho zzj() {
        try {
            zzahx zzahxVarZzc = zzaho.zzc(zzl());
            zza(zzahxVarZzc.zzb());
            return zzahxVarZzc.zza();
        } catch (IOException e10) {
            throw new RuntimeException(m1.j("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzaim zzaimVarZza = zzaim.zza(outputStream, zzaim.zzf(zzl()));
        zza(zzaimVarZza);
        zzaimVarZza.zzc();
    }
}
