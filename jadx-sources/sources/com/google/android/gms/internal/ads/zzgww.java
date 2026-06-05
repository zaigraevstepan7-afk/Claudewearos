package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwv;
import com.google.android.gms.internal.ads.zzgww;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgww<MessageType extends zzgww<MessageType, BuilderType>, BuilderType extends zzgwv<MessageType, BuilderType>> implements zzhag {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgwv.zzbd(iterable, list);
    }

    public static void zzaR(zzgxn zzgxnVar) {
        if (!zzgxnVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        return m1.k("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzhaz zzhazVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public zzgxn zzaN() {
        try {
            int iZzaY = zzaY();
            zzgxn zzgxnVar = zzgxn.zzb;
            byte[] bArr = new byte[iZzaY];
            int i10 = zzgya.zzf;
            zzgxw zzgxwVar = new zzgxw(bArr, 0, iZzaY);
            zzcZ(zzgxwVar);
            zzgxwVar.zzF();
            return new zzgxk(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(zzdI("ByteString"), e10);
        }
    }

    public zzhal zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhbk zzaP() {
        return new zzhbk(this);
    }

    public void zzaS(int i10) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) {
        int iZzaY = zzaY();
        zzgxy zzgxyVar = new zzgxy(outputStream, zzgya.zzB(zzgya.zzD(iZzaY) + iZzaY));
        zzgxyVar.zzu(iZzaY);
        zzcZ(zzgxyVar);
        zzgxyVar.zzK();
    }

    public void zzaU(OutputStream outputStream) {
        zzgxy zzgxyVar = new zzgxy(outputStream, zzgya.zzB(zzaY()));
        zzcZ(zzgxyVar);
        zzgxyVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            int i10 = zzgya.zzf;
            zzgxw zzgxwVar = new zzgxw(bArr, 0, iZzaY);
            zzcZ(zzgxwVar);
            zzgxwVar.zzF();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(zzdI("byte array"), e10);
        }
    }
}
