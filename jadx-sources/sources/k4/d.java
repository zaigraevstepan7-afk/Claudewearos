package k4;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import u4.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements rc.g, n {

    /* renamed from: a, reason: collision with root package name */
    public int f9420a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9421b;

    public /* synthetic */ d(int i10, Map map) {
        this.f9420a = i10;
        this.f9421b = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r1 = r0.f9434b;
        r0 = r0.f9433a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0200, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0202, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0204, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0218, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f9434b, r0.f9433a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022d, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022f, code lost:
    
        r1 = r0.f9434b;
        r0 = r0.f9433a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0236, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0239, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0250, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025c, code lost:
    
        return new k4.d(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new k4.i(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new k4.i(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new k4.i(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k4.d e(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.d.e(android.content.res.Resources, int, android.content.res.Resources$Theme):k4.d");
    }

    public void a(long j) {
        if (d(j)) {
            return;
        }
        int i10 = this.f9420a;
        long[] jArrCopyOf = (long[]) this.f9421b;
        if (i10 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i10 + 1, jArrCopyOf.length * 2));
            fj.l.e(jArrCopyOf, "copyOf(...)");
            this.f9421b = jArrCopyOf;
        }
        jArrCopyOf[i10] = j;
        if (i10 >= this.f9420a) {
            this.f9420a = i10 + 1;
        }
    }

    @Override // u4.n
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f9421b).B(this.f9420a);
        return true;
    }

    public void c() {
        WeakReference weakReference;
        int i10 = this.f9420a;
        this.f9420a = i10 + 1;
        if (i10 >= 10) {
            this.f9420a = 0;
            Iterator it = ((LinkedHashMap) this.f9421b).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    q8.f fVar = (q8.f) qi.l.A0(arrayList);
                    if (((fVar == null || (weakReference = fVar.f13307a) == null) ? null : (h8.j) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = i12 - i11;
                        if (((q8.f) arrayList.get(i13)).f13307a.get() == null) {
                            arrayList.remove(i13);
                            i11++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public boolean d(long j) {
        int i10 = this.f9420a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((long[]) this.f9421b)[i11] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // rc.g
    public void f(JsonWriter jsonWriter) throws IOException {
        int i10 = this.f9420a;
        Map map = (Map) this.f9421b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        rc.h.e(jsonWriter, map);
        jsonWriter.endObject();
    }

    public void g(int i10, String str, String str2) {
        HashSet hashSet = (HashSet) this.f9421b;
        if (y3.e.b(i10) >= y3.e.b(this.f9420a)) {
            if (hashSet == null || y3.e.b(i10) > 0 || hashSet.contains(str)) {
                int iB = y3.e.b(i10);
                if (iB == 0) {
                    Log.d(str, str2);
                    return;
                }
                if (iB == 1) {
                    Log.i(str, str2);
                } else if (iB == 2) {
                    Log.w(str, str2);
                } else {
                    if (iB != 3) {
                        throw new RuntimeException("Should not reach here!");
                    }
                    Log.e(str, str2);
                }
            }
        }
    }

    public void h(long j) {
        int i10 = this.f9420a;
        int i11 = 0;
        while (i11 < i10) {
            if (j == ((long[]) this.f9421b)[i11]) {
                int i12 = this.f9420a - 1;
                while (i11 < i12) {
                    long[] jArr = (long[]) this.f9421b;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f9420a--;
                return;
            }
            i11++;
        }
    }

    public void i(q8.a aVar, h8.j jVar, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f9421b;
        Object arrayList = linkedHashMap.get(aVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(aVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        q8.f fVar = new q8.f(new WeakReference(jVar), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                q8.f fVar2 = (q8.f) arrayList2.get(i10);
                if (j < fVar2.f13309c) {
                    i10++;
                } else if (fVar2.f13307a.get() == jVar) {
                    arrayList2.set(i10, fVar);
                } else {
                    arrayList2.add(i10, fVar);
                }
            }
        } else {
            arrayList2.add(fVar);
        }
        c();
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.f9421b = obj;
        this.f9420a = i10;
    }

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f9421b = shader;
        this.f9420a = i10;
    }
}
