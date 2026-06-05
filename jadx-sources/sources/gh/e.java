package gh;

import android.util.Base64;
import android.util.JsonWriter;
import eh.f;
import eh.g;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements eh.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7418a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f7419b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f7420c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f7421d;

    /* renamed from: e, reason: collision with root package name */
    public final eh.d f7422e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7423f;

    public e(BufferedWriter bufferedWriter, HashMap map, HashMap map2, a aVar, boolean z2) {
        this.f7419b = new JsonWriter(bufferedWriter);
        this.f7420c = map;
        this.f7421d = map2;
        this.f7422e = aVar;
        this.f7423f = z2;
    }

    @Override // eh.e
    public final eh.e a(eh.c cVar, Object obj) throws IOException {
        g(obj, cVar.f6080a);
        return this;
    }

    @Override // eh.g
    public final g b(String str) throws IOException {
        h();
        this.f7419b.value(str);
        return this;
    }

    @Override // eh.g
    public final g c(boolean z2) throws IOException {
        h();
        this.f7419b.value(z2);
        return this;
    }

    @Override // eh.e
    public final eh.e d(eh.c cVar, int i10) throws IOException {
        String str = cVar.f6080a;
        h();
        JsonWriter jsonWriter = this.f7419b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i10);
        return this;
    }

    @Override // eh.e
    public final eh.e e(eh.c cVar, long j) throws IOException {
        String str = cVar.f6080a;
        h();
        JsonWriter jsonWriter = this.f7419b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    public final void f(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f7419b;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new eh.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return;
            }
            eh.d dVar = (eh.d) this.f7420c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return;
            }
            f fVar = (f) this.f7421d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                h();
                jsonWriter.value(strName);
                return;
            } else {
                jsonWriter.beginObject();
                this.f7422e.a(obj, this);
                jsonWriter.endObject();
                return;
            }
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return;
        }
        jsonWriter.beginArray();
        int i10 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                jsonWriter.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j = jArr[i10];
                h();
                jsonWriter.value(j);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                f(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                f(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
    }

    public final void g(Object obj, String str) throws IOException {
        boolean z2 = this.f7423f;
        JsonWriter jsonWriter = this.f7419b;
        if (z2) {
            if (obj == null) {
                return;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            f(obj);
        }
    }

    public final void h() {
        if (!this.f7418a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
