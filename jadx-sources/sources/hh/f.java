package hh;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements eh.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f8001f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final eh.c f8002g = new eh.c("key", m1.o(m1.n(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final eh.c f8003h = new eh.c("value", m1.o(m1.n(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final gh.a f8004i = new gh.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f8005a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8006b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8007c;

    /* renamed from: d, reason: collision with root package name */
    public final eh.d f8008d;

    /* renamed from: e, reason: collision with root package name */
    public final h f8009e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, eh.d dVar) {
        this.f8005a = byteArrayOutputStream;
        this.f8006b = map;
        this.f8007c = map2;
        this.f8008d = dVar;
    }

    public static int g(eh.c cVar) {
        e eVar = (e) ((Annotation) cVar.f6081b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f7997a;
        }
        throw new eh.b("Field has no @Protobuf config");
    }

    @Override // eh.e
    public final eh.e a(eh.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(eh.c cVar, int i10, boolean z2) {
        if (z2 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f6081b.get(e.class));
        if (eVar == null) {
            throw new eh.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f7997a << 3);
        h(i10);
    }

    public final void c(eh.c cVar, Object obj, boolean z2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z2 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f8001f);
            h(bytes.length);
            this.f8005a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f8004i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z2 && dDoubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f8005a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z2 && fFloatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f8005a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z2 && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f6081b.get(e.class));
            if (eVar == null) {
                throw new eh.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f7997a << 3);
            i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z2 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f8005a.write(bArr);
            return;
        }
        eh.d dVar = (eh.d) this.f8006b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z2);
            return;
        }
        eh.f fVar = (eh.f) this.f8007c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f8009e;
            hVar.f8011a = false;
            hVar.f8013c = cVar;
            hVar.f8012b = z2;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f8008d, cVar, obj, z2);
        }
    }

    @Override // eh.e
    public final eh.e d(eh.c cVar, int i10) {
        b(cVar, i10, true);
        return this;
    }

    @Override // eh.e
    public final eh.e e(eh.c cVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f6081b.get(e.class));
        if (eVar == null) {
            throw new eh.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f7997a << 3);
        i(j);
        return this;
    }

    public final void f(eh.d dVar, eh.c cVar, Object obj, boolean z2) throws IOException {
        b bVar = new b();
        bVar.f7998a = 0L;
        try {
            OutputStream outputStream = this.f8005a;
            this.f8005a = bVar;
            try {
                dVar.a(obj, this);
                this.f8005a = outputStream;
                long j = bVar.f7998a;
                bVar.close();
                if (z2 && j == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f8005a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f8005a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f8005a.write(i10 & 127);
    }

    public final void i(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f8005a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f8005a.write(((int) j) & 127);
    }
}
