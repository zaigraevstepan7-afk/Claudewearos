package d7;

import ag.g;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.NoSuchPaddingException;
import nc.p;
import nf.n;
import of.f;
import of.h;
import t.m1;
import y3.e;
import zf.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4982a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4983b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final nf.a f4984c;

    /* renamed from: d, reason: collision with root package name */
    public final nf.c f4985d;

    public b(SharedPreferences sharedPreferences, nf.a aVar, nf.c cVar) {
        this.f4982a = sharedPreferences;
        this.f4984c = aVar;
        this.f4985d = cVar;
    }

    public static b a(Context context, c cVar) throws NoSuchPaddingException, NoSuchAlgorithmException {
        ac.d dVarC;
        ac.d dVarC2;
        String str = cVar.f4987b;
        int i10 = sf.a.f15024a;
        n.h(sf.c.f15029b);
        if (!rf.a.a()) {
            n.f(new h(f0.class, new f[]{new f(nf.c.class, 9)}, 8), true);
        }
        of.a.a();
        Context applicationContext = context.getApplicationContext();
        p pVar = new p();
        pVar.f12166f = nf.b.a("AES256_SIV");
        if (applicationContext == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        pVar.f12161a = applicationContext;
        pVar.f12162b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        pVar.f12163c = "folder_pin_store";
        String strI = m1.i("android-keystore://", str);
        if (!strI.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        pVar.f12164d = strI;
        tf.a aVarB = pVar.b();
        synchronized (aVarB) {
            dVarC = aVarB.f16325a.c();
        }
        p pVar2 = new p();
        pVar2.f12166f = nf.b.a("AES256_GCM");
        pVar2.f12161a = applicationContext;
        pVar2.f12162b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        pVar2.f12163c = "folder_pin_store";
        String strI2 = m1.i("android-keystore://", str);
        if (!strI2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        pVar2.f12164d = strI2;
        tf.a aVarB2 = pVar2.b();
        synchronized (aVarB2) {
            dVarC2 = aVarB2.f16325a.c();
        }
        nf.c cVar2 = (nf.c) dVarC.w(nf.c.class);
        return new b(applicationContext.getSharedPreferences("folder_pin_store", 0), (nf.a) dVarC2.w(nf.a.class), cVar2);
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(g.b(this.f4985d.a(str.getBytes(StandardCharsets.UTF_8), "folder_pin_store".getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new SecurityException("Could not encrypt key. " + e11.getMessage(), e11);
        }
    }

    public final Object c(String str) {
        String str2;
        if (d(str)) {
            throw new SecurityException(m1.v(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.f4982a.getString(strB, null);
            if (string != null) {
                byte[] bArrA = g.a(string);
                nf.a aVar = this.f4984c;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.b(bArrA, strB.getBytes(charset)));
                byteBufferWrap.position(0);
                int i10 = byteBufferWrap.getInt();
                int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
                if (i11 == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
                }
                int iB = e.b(i11);
                if (iB == 0) {
                    int i12 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i12);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iB != 1) {
                        if (iB == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iB == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iB == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iB == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i11) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    q.f fVar = new q.f(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i13 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i13);
                        byteBufferWrap.position(byteBufferWrap.position() + i13);
                        fVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (fVar.f13066c != 1 || !"__NULL__".equals(fVar.f13065b[0])) {
                        return fVar;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (d(str)) {
            throw new SecurityException(m1.v(str, " is a reserved key for the encryption keyset."));
        }
        return this.f4982a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f4982a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f4982a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.f4985d.b(g.a(entry.getKey()), "folder_pin_store".getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, c(str));
                } catch (GeneralSecurityException e10) {
                    throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z2) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z2;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        Object objC = c(str);
        return objC instanceof Float ? ((Float) objC).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objC = c(str);
        Set fVar = objC instanceof Set ? (Set) objC : new q.f(0);
        return fVar.size() > 0 ? fVar : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4983b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4983b.remove(onSharedPreferenceChangeListener);
    }
}
