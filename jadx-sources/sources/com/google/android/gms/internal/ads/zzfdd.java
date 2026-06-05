package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import mc.n;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfdd {
    public zzfdd() {
        try {
            zzgfe.zza();
        } catch (GeneralSecurityException e10) {
            l0.k("Failed to Configure Aead. ".concat(e10.toString()));
            n.D.f11582h.zzw(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() throws GeneralSecurityException {
        byte[] byteArray;
        try {
            zzgew zzgewVarZze = zzgew.zze(zzgeq.zza(zzgni.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgek.zzb(zzgewVarZze, zzgej.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            l0.k("Failed to generate key".concat(e10.toString()));
            n.D.f11582h.zzw(e10, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdrw zzdrwVar) {
        zzgew zzgewVarZzc;
        if (str != null && (zzgewVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzgeh) zzgewVarZzc.zzg(zzgfm.zza(), zzgeh.class)).zza(bArr, bArr2);
                zzdrwVar.zzb().put("ds", "1");
                return new String(bArrZza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e10) {
                l0.k("Failed to decrypt ".concat(e10.toString()));
                n.D.f11582h.zzw(e10, "CryptoUtils.decrypt");
                zzdrwVar.zzb().put("dsf", e10.toString());
            }
        }
        return null;
    }

    private static final zzgew zzc(String str) throws GeneralSecurityException {
        try {
            try {
                return zzgek.zza(zzgei.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            l0.k("Failed to get keysethandle".concat(e10.toString()));
            n.D.f11582h.zzw(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
