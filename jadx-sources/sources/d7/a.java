package d7;

import ag.g;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import q.f;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final b f4978a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f4979b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4981d = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f4980c = new CopyOnWriteArrayList();

    public a(b bVar, SharedPreferences.Editor editor) {
        this.f4978a = bVar;
        this.f4979b = editor;
    }

    public final void a() {
        if (this.f4981d.getAndSet(false)) {
            b bVar = this.f4978a;
            for (String str : ((HashMap) bVar.getAll()).keySet()) {
                if (!this.f4980c.contains(str) && !b.d(str)) {
                    this.f4979b.remove(bVar.b(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f4979b.apply();
        b();
        this.f4980c.clear();
    }

    public final void b() {
        b bVar = this.f4978a;
        Iterator it = bVar.f4983b.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.f4980c.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (String) it2.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        b bVar = this.f4978a;
        bVar.getClass();
        if (b.d(str)) {
            throw new SecurityException(m1.v(str, " is a reserved key for the encryption keyset."));
        }
        this.f4980c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = bVar.b(str);
            try {
                Pair pair = new Pair(strB, new String(g.b(bVar.f4984c.a(bArr, strB.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f4979b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new SecurityException("Could not encrypt data: " + e11.getMessage(), e11);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f4981d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4980c;
        a();
        try {
            return this.f4979b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z2 ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        int i10 = 0;
        if (set == null) {
            set = new f(0);
            set.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            byte[] bArr = (byte[]) obj;
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        b bVar = this.f4978a;
        bVar.getClass();
        if (b.d(str)) {
            throw new SecurityException(m1.v(str, " is a reserved key for the encryption keyset."));
        }
        this.f4979b.remove(bVar.b(str));
        this.f4980c.add(str);
        return this;
    }
}
