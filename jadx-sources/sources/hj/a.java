package hj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.h0;
import b0.k1;
import b0.o1;
import b0.q1;
import b0.r1;
import b0.t1;
import b3.e;
import c1.e4;
import c1.r3;
import c1.s3;
import c1.u6;
import c2.e0;
import c2.f0;
import c2.w;
import com.google.android.gms.internal.ads.zzfby;
import ej.c;
import f0.r0;
import f1.a1;
import f1.g1;
import f1.i0;
import f1.j1;
import f1.n1;
import f1.q2;
import f1.r2;
import f1.s;
import f1.t2;
import fj.l;
import g0.h;
import g0.n0;
import g0.t;
import g3.y;
import gi.d;
import i2.f;
import ib.s0;
import ib.t0;
import ib.v0;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.j;
import p2.k0;
import q.u;
import qc.l0;
import qi.m;
import qj.z;
import rc.b;
import rc.k;
import s3.o;
import s3.p;
import t.m1;
import v.i;
import v.n;
import w2.f1;
import wa.o0;
import wa.q;
import xa.g;
import zg.r;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static f f8016a = null;

    /* renamed from: b, reason: collision with root package name */
    public static f f8017b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8018c = true;

    /* renamed from: d, reason: collision with root package name */
    public static Field f8019d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f8020e;

    public static String A(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static ThreadPoolExecutor B() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("firebase-iid-executor", 1));
    }

    public static final long D(long j, float f10) {
        long jFloatToRawIntBits = j | (Float.floatToRawIntBits(f10) & 4294967295L);
        p[] pVarArr = o.f14756b;
        return jFloatToRawIntBits;
    }

    public static String E(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z2) {
                sb2.append("/");
            }
            sb2.append(str);
            z2 = false;
        }
        return sb2.toString();
    }

    public static boolean F(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static int G(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    public static int H(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long I(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    public static final v0 J(v0 v0Var, int i10) {
        Boolean bool;
        l.f(v0Var, "<this>");
        List<q> list = v0Var.f8462a;
        ArrayList arrayList = new ArrayList(m.s0(list));
        for (q qVar : list) {
            if (!(qVar instanceof q)) {
                throw new e();
            }
            List<o0> list2 = qVar.f19135a;
            ArrayList arrayList2 = new ArrayList(m.s0(list2));
            for (o0 o0Var : list2) {
                xa.f fVarA = o0Var.f19130a;
                if (fVarA.f19862a == i10 && (bool = fVarA.f19865d) != null) {
                    fVarA = xa.f.a(fVarA, null, Boolean.valueOf(!bool.booleanValue()), 7);
                }
                arrayList2.add(o0.a(o0Var, fVarA));
            }
            arrayList.add(q.a(qVar, arrayList2));
        }
        return v0.a(v0Var, arrayList, null, null, 0, null, null, null, null, null, null, 0.0f, null, 0, null, null, null, null, false, null, false, false, false, 8388606);
    }

    public static final v0 K(v0 v0Var) {
        List<q> list = v0Var.f8462a;
        ArrayList arrayList = new ArrayList(m.s0(list));
        for (q qVar : list) {
            if (!(qVar instanceof q)) {
                throw new e();
            }
            List<o0> list2 = qVar.f19135a;
            ArrayList arrayList2 = new ArrayList(m.s0(list2));
            for (o0 o0Var : list2) {
                xa.f fVar = o0Var.f19130a;
                if (fVar.f19865d == null) {
                    int i10 = g.f19866a;
                    fVar = new xa.f(fVar.f19862a, fVar.f19863b, fVar.f19864c, Boolean.FALSE);
                }
                arrayList2.add(o0.a(o0Var, fVar));
            }
            arrayList.add(q.a(qVar, arrayList2));
        }
        return v0.a(v0Var, arrayList, null, null, 0, null, null, null, null, null, null, 0.0f, null, 0, null, null, null, null, false, null, false, false, false, 8388606);
    }

    public static final v0 L(v0 v0Var) {
        return v0.a(v0Var, null, null, null, 0, null, null, null, null, null, null, 0.0f, t0.f8458a, 0, null, null, null, null, false, null, false, false, false, 8386559);
    }

    public static ArrayList O(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/", -1);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (!strArrSplit[i10].isEmpty()) {
                arrayList.add(strArrSplit[i10]);
            }
        }
        return arrayList;
    }

    public static final int P(u uVar) {
        int iC;
        int i10 = uVar.f13137b;
        int iC2 = uVar.c(0);
        while (uVar.f13137b != 0 && uVar.c(0) == iC2) {
            int i11 = uVar.f13137b;
            if (i11 == 0) {
                r.a.e("IntList is empty.");
                throw null;
            }
            uVar.e(0, uVar.f13136a[i11 - 1]);
            uVar.d(uVar.f13137b - 1);
            int i12 = uVar.f13137b;
            int i13 = i12 >>> 1;
            int i14 = 0;
            while (i14 < i13) {
                int iC3 = uVar.c(i14);
                int i15 = (i14 + 1) * 2;
                int i16 = i15 - 1;
                int iC4 = uVar.c(i16);
                if (i15 >= i12 || (iC = uVar.c(i15)) <= iC4) {
                    if (iC4 > iC3) {
                        uVar.e(i14, iC4);
                        uVar.e(i16, iC3);
                        i14 = i16;
                    }
                } else if (iC > iC3) {
                    uVar.e(i14, iC);
                    uVar.e(i15, iC3);
                    i14 = i15;
                }
            }
        }
        return iC2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList Q(android.content.Context r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.a.Q(android.content.Context, java.util.List):java.util.ArrayList");
    }

    public static final String R(int i10) {
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = lk.b.f11001a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        wd.a.p(i11, 8, 8);
        return new String(cArr2, i11, 8 - i11);
    }

    public static String S(int i10) {
        return i10 == 0 ? "Unspecified" : i10 == 1 ? "Text" : i10 == 2 ? "Ascii" : i10 == 3 ? "Number" : i10 == 4 ? "Phone" : i10 == 5 ? "Uri" : i10 == 6 ? "Email" : i10 == 7 ? "Password" : i10 == 8 ? "NumberPassword" : i10 == 9 ? "Decimal" : "Invalid";
    }

    public static Bundle T(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i10 = 0;
                        Object objOpt2 = null;
                        for (int i11 = 0; objOpt2 == null && i11 < length; i11++) {
                            objOpt2 = !jSONArray.isNull(i11) ? jSONArray.opt(i11) : null;
                        }
                        if (objOpt2 == null) {
                            String strValueOf = String.valueOf(next);
                            int i12 = l0.f13401b;
                            k.g("Expected JSONArray with at least 1 non-null element for key:".concat(strValueOf));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i10 < length) {
                                bundleArr[i10] = !jSONArray.isNull(i10) ? T(jSONArray.optJSONObject(i10)) : null;
                                i10++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i10 < length) {
                                dArr[i10] = jSONArray.optDouble(i10);
                                i10++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i10 < length) {
                                strArr[i10] = !jSONArray.isNull(i10) ? jSONArray.optString(i10) : null;
                                i10++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i10 < length) {
                                zArr[i10] = jSONArray.optBoolean(i10);
                                i10++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String strB = y8.f.b("JSONArray with unsupported type ", objOpt2.getClass().getCanonicalName(), " for key:", next);
                            int i13 = l0.f13401b;
                            k.g(strB);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, T((JSONObject) objOpt));
                } else {
                    String strValueOf2 = String.valueOf(next);
                    int i14 = l0.f13401b;
                    k.g("Unsupported type for key:".concat(strValueOf2));
                }
            }
        }
        return bundle;
    }

    public static List U(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
        }
        return arrayList;
    }

    public static ArrayList V(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONArray W(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(W(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(Y(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject X(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject Y(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, W(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, Y(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void Z(JsonWriter jsonWriter, JSONArray jSONArray) throws JSONException, IOException {
        try {
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object obj = jSONArray.get(i10);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    a0(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    Z(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final v1.o r17, final v1.g r18, boolean r19, float r20, c2.w0 r21, final mi.p r22, final ia.a r23, final ej.f r24, f1.i0 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.a.a(v1.o, v1.g, boolean, float, c2.w0, mi.p, ia.a, ej.f, f1.i0, int, int):void");
    }

    public static void a0(JsonWriter jsonWriter, JSONObject jSONObject) throws JSONException, IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    a0(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    Z(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(e0.a r22, v1.o r23, e0.v r24, b0.i1 r25, b0.i r26, b0.g r27, x.s0 r28, boolean r29, v.i r30, ej.c r31, f1.i0 r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.a.b(e0.a, v1.o, e0.v, b0.i1, b0.i, b0.g, x.s0, boolean, v.i, ej.c, f1.i0, int, int):void");
    }

    public static String b0(zzfby zzfbyVar) throws JSONException, IOException {
        if (zzfbyVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            d0(jsonWriter, zzfbyVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e10) {
            int i10 = l0.f13401b;
            k.e("Error when writing JSON.", e10);
            return null;
        }
    }

    public static final void c(final ej.a aVar, final c cVar, c cVar2, final fi.a aVar2, final v1.o oVar, float f10, final boolean z2, final boolean z10, final boolean z11, boolean z12, final float f11, i0 i0Var, final int i10) {
        final c cVar3;
        final float f12;
        final boolean z13;
        l.f(aVar, "selectedTabIndex");
        l.f(cVar, "onTabSelected");
        i0Var.c0(1255953222);
        int i11 = i10 | 384 | (i0Var.h(aVar2) ? 2048 : 1024) | 1572864 | (i0Var.g(z2) ? 8388608 : 4194304) | (i0Var.g(z10) ? 67108864 : 33554432) | (i0Var.g(z11) ? 536870912 : 268435456);
        if (i0Var.T(i11 & 1, ((306783379 & i11) == 306783378 && (((i0Var.c(f11) ? '\u0100' : '\u0080') | '\u0c36') & 1171) == 1170) ? false : true)) {
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = new y(11);
                i0Var.l0(objQ);
            }
            final c cVar4 = (c) objQ;
            final float f13 = 48;
            boolean zR = n.r(i0Var);
            final boolean z14 = !zR;
            final long jD = !zR ? e0.d(4283278335L) : e0.d(4284723455L);
            final long jC = w.c(w.f3054d, f11);
            final d dVarD = gi.f.d(null, i0Var, 0, 3);
            b0.d.a(oVar, v1.b.f17550d, j.d(-1290647524, new ej.f() { // from class: gb.f
                @Override // ej.f
                public final Object c(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    Object obj5;
                    float f14;
                    p1.e eVar = lb.c.f10181s;
                    b0.y yVar = (b0.y) obj;
                    i0 i0Var2 = (i0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    fj.l.f(yVar, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= i0Var2.f(yVar) ? 4 : 2;
                    }
                    if (i0Var2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        s3.c cVar5 = (s3.c) i0Var2.j(f1.f18262h);
                        float f15 = 3;
                        final float fH = (s3.a.h(yVar.f1460b) - cVar5.w0(8.0f)) / f15;
                        Object objQ2 = i0Var2.Q();
                        Object obj6 = f1.m.f6385a;
                        if (objQ2 == obj6) {
                            objQ2 = t.d.a(0.0f, 0.01f);
                            i0Var2.l0(objQ2);
                        }
                        t.c cVar6 = (t.c) objQ2;
                        boolean zF = i0Var2.f(cVar5);
                        Object objQ3 = i0Var2.Q();
                        if (zF || objQ3 == obj6) {
                            objQ3 = f1.s.q(new r3(cVar6, yVar, cVar5, 4));
                            i0Var2.l0(objQ3);
                        }
                        final q2 q2Var = (q2) objQ3;
                        final boolean z15 = i0Var2.j(f1.f18267n) == s3.m.f14752a;
                        Object objQ4 = i0Var2.Q();
                        if (objQ4 == obj6) {
                            objQ4 = f1.s.o(i0Var2);
                            i0Var2.l0(objQ4);
                        }
                        z zVar = (z) objQ4;
                        ej.a aVar3 = aVar;
                        boolean zF2 = i0Var2.f(aVar3);
                        Object objQ5 = i0Var2.Q();
                        if (zF2 || objQ5 == obj6) {
                            Object g1Var = new g1(((Number) aVar3.a()).intValue());
                            i0Var2.l0(g1Var);
                            objQ5 = g1Var;
                        }
                        Object obj7 = (g1) objQ5;
                        boolean zF3 = i0Var2.f(zVar);
                        Object objQ6 = i0Var2.Q();
                        if (zF3 || objQ6 == obj6) {
                            float fIntValue = ((Number) aVar3.a()).intValue();
                            kj.d dVar = new kj.d(0.0f, 2);
                            ej.c cVar7 = cVar4;
                            obj4 = aVar3;
                            obj5 = obj7;
                            objQ6 = new hb.h(zVar, fIntValue, dVar, 0.001f, 1.3928572f, new t2(cVar7, 1), new e0.t(cVar7, zVar, obj7, cVar6, 2), new d(fH, z15, zVar, cVar6));
                            i0Var2.l0(objQ6);
                        } else {
                            obj4 = aVar3;
                            obj5 = obj7;
                        }
                        final hb.h hVar = (hb.h) objQ6;
                        boolean zF4 = i0Var2.f(obj4) | i0Var2.f(obj5);
                        Object objQ7 = i0Var2.Q();
                        ti.c cVar8 = null;
                        if (zF4 || objQ7 == obj6) {
                            objQ7 = new h0(obj4, obj5, cVar8, 8);
                            i0Var2.l0(objQ7);
                        }
                        f1.s.f((ej.e) objQ7, i0Var2, obj4);
                        boolean zF5 = i0Var2.f(obj5) | i0Var2.h(hVar);
                        Object obj8 = cVar;
                        boolean zF6 = zF5 | i0Var2.f(obj8);
                        Object objQ8 = i0Var2.Q();
                        if (zF6 || objQ8 == obj6) {
                            objQ8 = new ab.s(obj5, hVar, obj8, cVar8, 9);
                            i0Var2.l0(objQ8);
                        }
                        f1.s.f((ej.e) objQ8, i0Var2, hVar);
                        boolean zF7 = i0Var2.f(zVar);
                        Object objQ9 = i0Var2.Q();
                        if (zF7 || objQ9 == obj6) {
                            objQ9 = new hb.n(zVar, new ej.e() { // from class: gb.e
                                @Override // ej.e
                                public final Object invoke(Object obj9, Object obj10) {
                                    float fIntBitsToFloat;
                                    float fD;
                                    b2.e eVar2 = (b2.e) obj9;
                                    boolean z16 = z15;
                                    hb.h hVar2 = hVar;
                                    float f16 = fH;
                                    q2 q2Var2 = q2Var;
                                    if (z16) {
                                        fIntBitsToFloat = (hVar2.c() + 0.5f) * f16;
                                        fD = hj.a.d(q2Var2);
                                    } else {
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (eVar2.f1514a >> 32)) - ((hVar2.c() + 0.5f) * f16);
                                        fD = hj.a.d(q2Var2);
                                    }
                                    float f17 = fD + fIntBitsToFloat;
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eVar2.f1514a & 4294967295L)) / 2.0f;
                                    return new b2.b((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32));
                                }
                            });
                            i0Var2.l0(objQ9);
                        }
                        final hb.n nVar = (hb.n) objQ9;
                        boolean zF8 = i0Var2.f(q2Var);
                        Object objQ10 = i0Var2.Q();
                        if (zF8 || objQ10 == obj6) {
                            objQ10 = new ab.z(q2Var, 4);
                            i0Var2.l0(objQ10);
                        }
                        v1.l lVar = v1.l.f17564b;
                        v1.o oVarQ = e0.q(lVar, (ej.c) objQ10);
                        Object objQ11 = i0Var2.Q();
                        if (objQ11 == obj6) {
                            objQ11 = new fa.a(13);
                            i0Var2.l0(objQ11);
                        }
                        ej.a aVar4 = (ej.a) objQ11;
                        boolean zG = i0Var2.g(true);
                        final boolean z16 = z11;
                        boolean zG2 = zG | i0Var2.g(z16);
                        final boolean z17 = z10;
                        boolean zG3 = zG2 | i0Var2.g(z17);
                        Object objQ12 = i0Var2.Q();
                        if (zG3 || objQ12 == obj6) {
                            objQ12 = new ej.c() { // from class: gb.g
                                @Override // ej.c
                                public final Object invoke(Object obj9) {
                                    fi.e eVar2 = (fi.e) obj9;
                                    fj.l.f(eVar2, "$this$drawBackdrop");
                                    hi.a.a(eVar2);
                                    if (z16) {
                                        yd.f.l(eVar2, eVar2.f6754a * 8.0f);
                                    }
                                    if (z17) {
                                        float f16 = eVar2.f6754a;
                                        a.a.J(eVar2, f16 * 24.0f, f16 * 24.0f, false, (12 & 8) == 0);
                                    }
                                    return pi.o.f13011a;
                                }
                            };
                            i0Var2.l0(objQ12);
                        }
                        ej.c cVar9 = (ej.c) objQ12;
                        boolean zH = i0Var2.h(hVar);
                        Object objQ13 = i0Var2.Q();
                        if (zH || objQ13 == obj6) {
                            objQ13 = new h(hVar, 0);
                            i0Var2.l0(objQ13);
                        }
                        ej.c cVar10 = (ej.c) objQ13;
                        final long j = jC;
                        boolean zE = i0Var2.e(j);
                        Object objQ14 = i0Var2.Q();
                        if (zE || objQ14 == obj6) {
                            f14 = f15;
                            objQ14 = new f1.b(j, 1);
                            i0Var2.l0(objQ14);
                        } else {
                            f14 = f15;
                        }
                        ej.c cVar11 = (ej.c) objQ14;
                        final fi.a aVar5 = aVar2;
                        v1.o oVarC = fi.c.b(oVarQ, aVar5, aVar4, cVar9, null, null, null, cVar10, null, cVar11, 3000).c(nVar.f7837i);
                        final float f16 = f13;
                        v1.o oVarT = b0.d.t(4.0f, t1.c(1.0f, t1.e(f16, oVarC)));
                        q1 q1VarA = o1.a(b0.j.f1359a, v1.b.D, i0Var2, 48);
                        int iHashCode = Long.hashCode(i0Var2.T);
                        n1 n1VarL = i0Var2.l();
                        v1.o oVarC2 = v1.a.c(i0Var2, oVarT);
                        v2.h.f17668w.getClass();
                        ej.a aVar6 = v2.g.f17645b;
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar6);
                        } else {
                            i0Var2.o0();
                        }
                        f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
                        f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
                        f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
                        f1.s.I(v2.g.f17651h, i0Var2);
                        f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
                        eVar.c(r1.f1410a, i0Var2, 6);
                        i0Var2.p(true);
                        r2 r2Var = a.f7269a;
                        boolean zH2 = i0Var2.h(hVar);
                        Object objQ15 = i0Var2.Q();
                        if (zH2 || objQ15 == obj6) {
                            objQ15 = new b(hVar, 3);
                            i0Var2.l0(objQ15);
                        }
                        f1.r1 r1VarA = r2Var.a((ej.a) objQ15);
                        final gi.d dVar2 = dVarD;
                        final long j4 = jD;
                        f1.s.a(r1VarA, p1.j.d(580275420, new ej.e() { // from class: gb.k
                            @Override // ej.e
                            public final Object invoke(Object obj9, Object obj10) {
                                p1.e eVar2 = lb.c.f10181s;
                                i0 i0Var3 = (i0) obj9;
                                int iIntValue2 = ((Integer) obj10).intValue();
                                int i12 = 0;
                                int i13 = 2;
                                if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    Object objQ16 = i0Var3.Q();
                                    Object obj11 = f1.m.f6385a;
                                    if (objQ16 == obj11) {
                                        objQ16 = new y(12);
                                        i0Var3.l0(objQ16);
                                    }
                                    AtomicInteger atomicInteger = d3.p.f4762a;
                                    v1.o oVarA = gi.f.a(z1.h.a(0.0f, new d3.c((ej.c) objQ16)), dVar2);
                                    q2 q2Var2 = q2Var;
                                    boolean zF9 = i0Var3.f(q2Var2);
                                    Object objQ17 = i0Var3.Q();
                                    int i14 = 5;
                                    if (zF9 || objQ17 == obj11) {
                                        objQ17 = new ab.z(q2Var2, i14);
                                        i0Var3.l0(objQ17);
                                    }
                                    v1.o oVarQ2 = e0.q(oVarA, (ej.c) objQ17);
                                    Object objQ18 = i0Var3.Q();
                                    if (objQ18 == obj11) {
                                        objQ18 = new fa.a(14);
                                        i0Var3.l0(objQ18);
                                    }
                                    ej.a aVar7 = (ej.a) objQ18;
                                    hb.h hVar2 = hVar;
                                    boolean zH3 = i0Var3.h(hVar2) | i0Var3.g(true);
                                    boolean z18 = z16;
                                    boolean zG4 = zH3 | i0Var3.g(z18);
                                    boolean z19 = z17;
                                    boolean zG5 = zG4 | i0Var3.g(z19);
                                    Object objQ19 = i0Var3.Q();
                                    if (zG5 || objQ19 == obj11) {
                                        objQ19 = new i(hVar2, z18, z19, i12);
                                        i0Var3.l0(objQ19);
                                    }
                                    ej.c cVar12 = (ej.c) objQ19;
                                    boolean zH4 = i0Var3.h(hVar2);
                                    Object objQ20 = i0Var3.Q();
                                    if (zH4 || objQ20 == obj11) {
                                        objQ20 = new b(hVar2, i13);
                                        i0Var3.l0(objQ20);
                                    }
                                    ej.a aVar8 = (ej.a) objQ20;
                                    long j10 = j;
                                    boolean zE2 = i0Var3.e(j10);
                                    Object objQ21 = i0Var3.Q();
                                    if (zE2 || objQ21 == obj11) {
                                        objQ21 = new f1.b(j10, i13);
                                        i0Var3.l0(objQ21);
                                    }
                                    v1.o oVarS = e0.s(b0.d.v(t1.c(1.0f, t1.e(f16 - 6, fi.c.b(oVarQ2, aVar5, aVar7, cVar12, aVar8, null, null, null, null, (ej.c) objQ21, 3056).c(nVar.f7837i))), 4.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, null, new c2.n(j4, 5), 262143);
                                    q1 q1VarA2 = o1.a(b0.j.f1359a, v1.b.D, i0Var3, 48);
                                    int iHashCode2 = Long.hashCode(i0Var3.T);
                                    n1 n1VarL2 = i0Var3.l();
                                    v1.o oVarC3 = v1.a.c(i0Var3, oVarS);
                                    v2.h.f17668w.getClass();
                                    ej.a aVar9 = v2.g.f17645b;
                                    i0Var3.e0();
                                    if (i0Var3.S) {
                                        i0Var3.k(aVar9);
                                    } else {
                                        i0Var3.o0();
                                    }
                                    f1.s.M(v2.g.f17649f, i0Var3, q1VarA2);
                                    f1.s.M(v2.g.f17648e, i0Var3, n1VarL2);
                                    f1.s.w(i0Var3, Integer.valueOf(iHashCode2), v2.g.f17650g);
                                    f1.s.I(v2.g.f17651h, i0Var3);
                                    f1.s.M(v2.g.f17647d, i0Var3, oVarC3);
                                    eVar2.c(r1.f1410a, i0Var3, 6);
                                    i0Var3.p(true);
                                } else {
                                    i0Var3.W();
                                }
                                return pi.o.f13011a;
                            }
                        }, i0Var2), i0Var2, 56);
                        v1.o oVarV = b0.d.v(lVar, 4.0f, 0.0f, 2);
                        boolean zG4 = i0Var2.g(z15) | i0Var2.h(hVar) | i0Var2.c(fH) | i0Var2.f(q2Var);
                        Object objQ16 = i0Var2.Q();
                        if (zG4 || objQ16 == obj6) {
                            objQ16 = new ej.c() { // from class: gb.l
                                @Override // ej.c
                                public final Object invoke(Object obj9) {
                                    float fIntBitsToFloat;
                                    float fD;
                                    f0 f0Var = (f0) obj9;
                                    fj.l.f(f0Var, "$this$graphicsLayer");
                                    boolean z18 = z15;
                                    hb.h hVar2 = hVar;
                                    float f17 = fH;
                                    q2 q2Var2 = q2Var;
                                    if (z18) {
                                        fIntBitsToFloat = hVar2.c() * f17;
                                        fD = hj.a.d(q2Var2);
                                    } else {
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (f0Var.a() >> 32)) - ((hVar2.c() + 1.0f) * f17);
                                        fD = hj.a.d(q2Var2);
                                    }
                                    f0Var.s(fD + fIntBitsToFloat);
                                    return pi.o.f13011a;
                                }
                            };
                            i0Var2.l0(objQ16);
                        }
                        v1.o oVarC3 = e0.q(oVarV, (ej.c) objQ16).c(nVar.j).c(hVar.f7814s);
                        gi.c cVarC = gi.f.c(aVar5, dVar2, i0Var2);
                        Object objQ17 = i0Var2.Q();
                        if (objQ17 == obj6) {
                            objQ17 = new fa.a(15);
                            i0Var2.l0(objQ17);
                        }
                        ej.a aVar7 = (ej.a) objQ17;
                        boolean zH3 = i0Var2.h(hVar) | i0Var2.g(z17);
                        Object objQ18 = i0Var2.Q();
                        if (zH3 || objQ18 == obj6) {
                            objQ18 = new c(2, hVar, z17);
                            i0Var2.l0(objQ18);
                        }
                        ej.c cVar12 = (ej.c) objQ18;
                        boolean zH4 = i0Var2.h(hVar);
                        Object objQ19 = i0Var2.Q();
                        if (zH4 || objQ19 == obj6) {
                            objQ19 = new b(hVar, 4);
                            i0Var2.l0(objQ19);
                        }
                        ej.a aVar8 = (ej.a) objQ19;
                        boolean zH5 = i0Var2.h(hVar);
                        Object objQ20 = i0Var2.Q();
                        if (zH5 || objQ20 == obj6) {
                            objQ20 = new b(hVar, 0);
                            i0Var2.l0(objQ20);
                        }
                        ej.a aVar9 = (ej.a) objQ20;
                        boolean zH6 = i0Var2.h(hVar);
                        Object objQ21 = i0Var2.Q();
                        if (zH6 || objQ21 == obj6) {
                            objQ21 = new b(hVar, 1);
                            i0Var2.l0(objQ21);
                        }
                        ej.a aVar10 = (ej.a) objQ21;
                        boolean zH7 = i0Var2.h(hVar);
                        boolean z18 = z2;
                        boolean zG5 = zH7 | i0Var2.g(z18);
                        Object objQ22 = i0Var2.Q();
                        if (zG5 || objQ22 == obj6) {
                            objQ22 = new c(0, hVar, z18);
                            i0Var2.l0(objQ22);
                        }
                        ej.c cVar13 = (ej.c) objQ22;
                        boolean zH8 = i0Var2.h(hVar);
                        boolean z19 = z14;
                        boolean zG6 = zH8 | i0Var2.g(z19);
                        Object objQ23 = i0Var2.Q();
                        if (zG6 || objQ23 == obj6) {
                            objQ23 = new c(1, hVar, z19);
                            i0Var2.l0(objQ23);
                        }
                        b0.r.a(t1.c(1.0f / f14, t1.e(f16 - 6, fi.c.b(oVarC3, cVarC, aVar7, cVar12, aVar8, aVar9, aVar10, cVar13, null, (ej.c) objQ23, 2944))), i0Var2, 0);
                    } else {
                        i0Var2.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 3126, 4);
            f12 = f13;
            cVar3 = cVar4;
            z13 = true;
        } else {
            i0Var.W();
            cVar3 = cVar2;
            f12 = f10;
            z13 = z12;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(cVar, cVar3, aVar2, oVar, f12, z2, z10, z11, z13, f11, i10) { // from class: gb.j
                public final /* synthetic */ boolean A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ float D;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ej.c f7300b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ej.c f7301c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fi.a f7302d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ v1.o f7303e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f7304f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ boolean f7305z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(221239);
                    hj.a.c(this.f7299a, this.f7300b, this.f7301c, this.f7302d, this.f7303e, this.f7304f, this.f7305z, this.A, this.B, this.C, this.D, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static JSONObject c0(JSONObject jSONObject, String[] strArr) {
        for (int i10 = 0; i10 < strArr.length - 1; i10 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public static final float d(q2 q2Var) {
        return ((Number) q2Var.getValue()).floatValue();
    }

    public static void d0(JsonWriter jsonWriter, Object obj) throws JSONException, IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof zzfby) {
            a0(jsonWriter, ((zzfby) obj).zzd);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d0(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                d0(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    public static final void e(v1.o oVar, g0.h0 h0Var, final k1 k1Var, final y.g gVar, final boolean z2, final i iVar, int i10, final float f10, final g0.l lVar, o2.a aVar, final v1.f fVar, final y.m mVar, final p1.e eVar, i0 i0Var, final int i11, final int i12) {
        int i13;
        int i14;
        v1.o oVar2;
        g0.h0 h0Var2;
        int i15;
        g0.h0 h0Var3;
        int i16;
        int i17;
        z zVar;
        x.o1 o1Var;
        lj.c cVar;
        ?? r62;
        v1.o oVarM;
        o2.a aVar2 = aVar;
        x.o1 o1Var2 = x.o1.f19665b;
        Object obj = v1.b.F;
        i0Var.c0(-572816025);
        if ((i11 & 6) == 0) {
            i13 = i11 | (i0Var.f(oVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= i0Var.f(h0Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= i0Var.f(k1Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= i0Var.g(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= i0Var.d(1) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= i0Var.f(gVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= i0Var.g(z2) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= i0Var.f(iVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= i0Var.d(i10) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= i0Var.c(f10) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (i0Var.f(lVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= i0Var.h(aVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= i0Var.h(null) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= i0Var.f(obj) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= i0Var.f(fVar) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= i0Var.f(mVar) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= i0Var.h(eVar) ? 1048576 : 524288;
        }
        int i18 = i14;
        if (i0Var.T(i13 & 1, ((i13 & 306783379) == 306783378 && (599187 & i18) == 599186) ? false : true)) {
            if (i10 < 0) {
                a0.a.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i10);
            }
            int i19 = i13 & 112;
            boolean z10 = i19 == 32;
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (z10 || objQ == obj2) {
                objQ = new g0.e(h0Var, 0);
                i0Var.l0(objQ);
            }
            ej.a aVar3 = (ej.a) objQ;
            int i20 = i13 >> 3;
            int i21 = i20 & 14;
            int i22 = i18 >> 15;
            int i23 = i21 | (i22 & 112) | (i18 & 896);
            a1 a1VarK = s.K(eVar, i0Var);
            a1 a1VarK2 = s.K(null, i0Var);
            boolean zF = ((((i23 & 14) ^ 6) > 4 && i0Var.f(h0Var)) || (i23 & 6) == 4) | i0Var.f(a1VarK) | i0Var.f(a1VarK2) | i0Var.f(aVar3);
            Object objQ2 = i0Var.Q();
            if (zF || objQ2 == obj2) {
                f1.f fVar2 = f1.f.f6291e;
                objQ2 = new e4(0, 6, q2.class, s.r(new s3(7, s.r(new g0.g(a1VarK, a1VarK2, aVar3), fVar2), h0Var), fVar2), "value", "getValue()Ljava/lang/Object;");
                i0Var.l0(objQ2);
            }
            lj.c cVar2 = (lj.c) objQ2;
            Object objQ3 = i0Var.Q();
            if (objQ3 == obj2) {
                objQ3 = s.o(i0Var);
                i0Var.l0(objQ3);
            }
            z zVar2 = (z) objQ3;
            boolean z11 = i19 == 32;
            Object objQ4 = i0Var.Q();
            if (z11 || objQ4 == obj2) {
                objQ4 = new g0.e(h0Var, 1);
                i0Var.l0(objQ4);
            }
            ej.a aVar4 = (ej.a) objQ4;
            int i24 = i13 >> 9;
            int i25 = (i13 & 65520) | (i24 & 458752) | (i24 & 3670016) | ((i18 << 21) & 29360128);
            int i26 = i18 << 15;
            int i27 = i25 | (i26 & 234881024) | (i26 & 1879048192);
            boolean zF2 = ((((i27 & 458752) ^ 196608) > 131072 && i0Var.d(i10)) || (i27 & 196608) == 131072) | ((((i27 & 896) ^ 384) > 256 && i0Var.f(k1Var)) || (i27 & 384) == 256) | ((((i27 & 112) ^ 48) > 32 && i0Var.f(h0Var)) || (i27 & 48) == 32) | ((((i27 & 7168) ^ 3072) > 2048 && i0Var.g(false)) || (i27 & 3072) == 2048) | ((((57344 & i27) ^ 24576) > 16384 && i0Var.d(1)) || (i27 & 24576) == 16384) | ((((i27 & 234881024) ^ 100663296) > 67108864 && i0Var.f(obj)) || (i27 & 100663296) == 67108864) | ((((i27 & 1879048192) ^ 805306368) > 536870912 && i0Var.f(fVar)) || (i27 & 805306368) == 536870912) | ((((i27 & 3670016) ^ 1572864) > 1048576 && i0Var.c(f10)) || (i27 & 1572864) == 1048576) | ((((i27 & 29360128) ^ 12582912) > 8388608 && i0Var.f(lVar)) || (i27 & 12582912) == 8388608) | ((((i22 & 14) ^ 6) > 4 && i0Var.f(mVar)) || (i22 & 6) == 4) | i0Var.f(aVar4) | i0Var.f(zVar2);
            Object objQ5 = i0Var.Q();
            if (zF2 || objQ5 == obj2) {
                i15 = i10;
                h0Var3 = h0Var;
                i16 = 4;
                i17 = i19;
                zVar = zVar2;
                o1Var = o1Var2;
                objQ5 = new g0.y(h0Var3, k1Var, f10, lVar, cVar2, aVar4, fVar, i15, mVar, zVar);
                cVar = cVar2;
                i0Var.l0(objQ5);
            } else {
                h0Var3 = h0Var;
                cVar = cVar2;
                i16 = 4;
                i17 = i19;
                zVar = zVar2;
                i15 = i10;
                o1Var = o1Var2;
            }
            f0.f0 f0Var = (f0.f0) objQ5;
            x.o1 o1Var3 = x.o1.f19664a;
            boolean zG = (((i21 ^ 6) > i16 && i0Var.f(h0Var3)) || (i20 & 6) == i16) | i0Var.g(false);
            Object objQ6 = i0Var.Q();
            if (zG || objQ6 == obj2) {
                objQ6 = new h(h0Var3, false);
                i0Var.l0(objQ6);
            }
            r0 r0Var = (r0) objQ6;
            boolean z12 = (i17 == 32) | ((i13 & 458752) == 131072);
            Object objQ7 = i0Var.Q();
            if (z12 || objQ7 == obj2) {
                objQ7 = new n0(gVar, h0Var3);
                i0Var.l0(objQ7);
            }
            n0 n0Var = (n0) objQ7;
            x.d dVar = (x.d) i0Var.j(x.f.f19517a);
            s3.m mVar2 = (s3.m) i0Var.j(f1.f18267n);
            i0Var.b0(-853904960);
            boolean zF3 = (i17 == 32) | i0Var.f(dVar) | i0Var.d(mVar2.ordinal());
            Object objQ8 = i0Var.Q();
            if (zF3 || objQ8 == obj2) {
                objQ8 = new g0.n(h0Var3, dVar, mVar2);
                i0Var.l0(objQ8);
            }
            g0.n nVar = (g0.n) objQ8;
            i0Var.p(false);
            v1.l lVar2 = v1.l.f17564b;
            if (z2) {
                i0Var.b0(-853484445);
                int i28 = i21 | ((i13 >> 21) & 112);
                boolean z13 = ((((i28 & 112) ^ 48) > 32 && i0Var.d(i15)) || (i28 & 48) == 32) | ((((i28 & 14) ^ 6) > i16 && i0Var.f(h0Var3)) || (i28 & 6) == i16);
                Object objQ9 = i0Var.Q();
                if (z13 || objQ9 == obj2) {
                    objQ9 = new g0.m(h0Var3, i15);
                    i0Var.l0(objQ9);
                }
                oVarM = f0.o.m((g0.m) objQ9, h0Var3.f6910v, o1Var);
                r62 = 0;
                i0Var.p(false);
            } else {
                r62 = 0;
                i0Var.b0(-853054661);
                i0Var.p(false);
                oVarM = lVar2;
            }
            oVar2 = oVar;
            v1.o oVarN = f0.o.n(oVar2.c(h0Var3.f6913y).c(h0Var3.f6911w), cVar, r0Var, o1Var, z2);
            h0Var2 = h0Var3;
            aVar2 = aVar;
            f0.o.a(cVar, o2.f.a(n.u((z2 ? oVarN.c(d3.p.a(lVar2, r62, new t(r62, h0Var3, zVar, r62))) : oVarN.c(lVar2)).c(oVarM), h0Var3, o1Var, iVar, z2, n0Var, h0Var3.f6904p, nVar).c(k0.a(lVar2, h0Var2, new u6(h0Var2, 1))), aVar2, null), h0Var2.f6908t, f0Var, i0Var, 0);
        } else {
            oVar2 = oVar;
            h0Var2 = h0Var;
            i15 = i10;
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            final g0.h0 h0Var4 = h0Var2;
            final int i29 = i15;
            final v1.o oVar3 = oVar2;
            final o2.a aVar5 = aVar2;
            t1VarU.f6456d = new ej.e() { // from class: g0.f
                {
                    x.o1 o1Var4 = x.o1.f19664a;
                }

                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    x.o1 o1Var4 = x.o1.f19664a;
                    ((Integer) obj4).getClass();
                    int iO = f1.s.O(i11 | 1);
                    int iO2 = f1.s.O(i12);
                    hj.a.e(oVar3, h0Var4, k1Var, gVar, z2, iVar, i29, f10, lVar, aVar5, fVar, mVar, eVar, (f1.i0) obj3, iO, iO2);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void f(v1.o oVar, f1.q1 q1Var, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-714464401);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(q1Var) ? 32 : 16;
        }
        int i12 = i10 & 384;
        p1.e eVar2 = p0.j.f12619a;
        if (i12 == 0) {
            i11 |= i0Var.h(eVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.h(eVar) ? 2048 : 1024;
        }
        if (i0Var.T(i11 & 1, (i11 & 1171) != 1170)) {
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                Object j1Var = new j1(null, f1.f.f6290d);
                i0Var.l0(j1Var);
                objQ = j1Var;
            }
            r0.c cVarL = l(eVar2, i0Var, (i11 >> 6) & 14);
            s.a(q1Var.a(cVarL), j.d(274270255, new bb.c(oVar, (a1) objQ, eVar, cVarL), i0Var), i0Var, 56);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(oVar, q1Var, eVar, i10, 7);
        }
    }

    public static void g(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final Exception h(b5.a aVar, String str, a5.c cVar) {
        return new a5.c(aVar, str);
    }

    public static final void i(u uVar, int i10) {
        if (uVar.f13137b == 0 || !(uVar.c(0) == i10 || uVar.c(uVar.f13137b - 1) == i10)) {
            int i11 = uVar.f13137b;
            uVar.a(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iC = uVar.c(i12);
                if (i10 <= iC) {
                    break;
                }
                uVar.e(i11, iC);
                i11 = i12;
            }
            uVar.e(i11, i10);
        }
    }

    public static final Context j(cl.a aVar) throws e8.b {
        l.f(aVar, "<this>");
        try {
            return (Context) aVar.a(fj.w.a(Context.class), null);
        } catch (tk.a unused) {
            throw new e8.b("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 1);
        }
    }

    public static final boolean k(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        l.f(bArr, "a");
        l.f(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final r0.c l(p1.e eVar, i0 i0Var, int i10) {
        boolean z2 = (((i10 & 14) ^ 6) > 4 && i0Var.f(eVar)) || (i10 & 6) == 4;
        Object objQ = i0Var.Q();
        Object obj = f1.m.f6385a;
        if (z2 || objQ == obj) {
            objQ = new r0.c(eVar);
            i0Var.l0(objQ);
        }
        r0.c cVar = (r0.c) objQ;
        boolean zF = i0Var.f(cVar);
        Object objQ2 = i0Var.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new q0.i(cVar, 3);
            i0Var.l0(objQ2);
        }
        s.c(cVar, (c) objQ2, i0Var);
        return cVar;
    }

    public static v0 m(v0 v0Var) {
        return v0.a(v0Var, null, null, null, 0, null, null, null, null, null, null, 68, null, 0, null, null, null, null, false, null, false, false, false, 8387583);
    }

    public static final void n(long j, long j4, long j10) {
        if ((j4 | j10) < 0 || j4 > j || j - j4 < j10) {
            StringBuilder sbL = m1.l("size=", " offset=", j);
            sbL.append(j4);
            sbL.append(" byteCount=");
            sbL.append(j10);
            throw new ArrayIndexOutOfBoundsException(sbL.toString());
        }
    }

    public static int o(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static byte[] p(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int iDigit = Character.digit(str.charAt(i11), 16);
            int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static final void q(Drawable drawable, Canvas canvas, int i10, float f10, float f11) {
        int iSave = canvas.save();
        if (f10 != 1.0f) {
            float f12 = i10 / 2.0f;
            canvas.scale(f10, f10, f12, f12);
        }
        Rect rect = new Rect(drawable.getBounds());
        int alpha = drawable.getAlpha();
        drawable.setBounds(0, 0, i10, i10);
        drawable.setAlpha(cg.b.p((int) (cg.b.o(f11, 0.0f, 1.0f) * alpha), 0, 255));
        drawable.draw(canvas);
        drawable.setAlpha(alpha);
        drawable.setBounds(rect);
        canvas.restoreToCount(iSave);
    }

    public static String r(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(i10 / 16));
            sb2.append("0123456789abcdef".charAt(i10 % 16));
        }
        return sb2.toString();
    }

    public static String s(com.google.crypto.tink.shaded.protobuf.i iVar) {
        StringBuilder sb2 = new StringBuilder(iVar.size());
        for (int i10 = 0; i10 < iVar.size(); i10++) {
            byte b10 = iVar.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final v0 t(v0 v0Var) {
        l.f(v0Var, "<this>");
        List<q> list = v0Var.f8462a;
        ArrayList arrayList = new ArrayList(m.s0(list));
        for (q qVar : list) {
            if (!(qVar instanceof q)) {
                throw new e();
            }
            List<o0> list2 = qVar.f19135a;
            ArrayList arrayList2 = new ArrayList(m.s0(list2));
            for (o0 o0Var : list2) {
                xa.f fVar = o0Var.f19130a;
                if (fVar.f19865d != null) {
                    int i10 = g.f19866a;
                    fVar = new xa.f(fVar.f19862a, fVar.f19863b, fVar.f19864c, null);
                }
                arrayList2.add(o0.a(o0Var, fVar));
            }
            arrayList.add(q.a(qVar, arrayList2));
        }
        return v0.a(v0.a(v0Var, arrayList, null, null, 0, null, null, null, null, null, null, 0.0f, s0.f8456a, 0, null, null, null, null, false, null, false, false, false, 8386558), null, null, null, 0, null, null, null, null, null, null, 68, null, 0, null, null, null, null, false, null, false, false, false, 8387583);
    }

    public static final int u(k3.s sVar, int i10) {
        boolean z2 = sVar.compareTo(k3.s.f9397d) >= 0;
        boolean z10 = i10 == 1;
        if (z10 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z10 ? 2 : 0;
    }

    public static final long w(double d10) {
        return D(4294967296L, (float) d10);
    }

    public static final long x(int i10) {
        return D(4294967296L, i10);
    }

    public static void z(boolean z2, String str, Object... objArr) {
        if (!z2) {
            throw new AssertionError("hardAssert failed: ".concat(String.format(str, objArr)));
        }
    }

    public abstract r C();

    public void M(View view, float f10) {
        if (f8018c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f8018c = false;
            }
        }
        view.setAlpha(f10);
    }

    public void N(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f8020e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f8019d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f8020e = true;
        }
        Field field = f8019d;
        if (field != null) {
            try {
                f8019d.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract a v(zg.c cVar);

    public float y(View view) {
        if (f8018c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f8018c = false;
            }
        }
        return view.getAlpha();
    }
}
