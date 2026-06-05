package ak;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f664a;

    /* renamed from: b, reason: collision with root package name */
    public int f665b;

    /* renamed from: c, reason: collision with root package name */
    public Object f666c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f667d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f668e;

    /* renamed from: f, reason: collision with root package name */
    public Object f669f;

    /* renamed from: g, reason: collision with root package name */
    public Object f670g;

    /* renamed from: h, reason: collision with root package name */
    public Object f671h;

    /* renamed from: i, reason: collision with root package name */
    public Object f672i;

    public m(ef.m mVar) {
        this.f664a = 1;
        c();
        a(StateSet.WILD_CARD, mVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ef.m[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, ef.m mVar) {
        int i10 = this.f665b;
        if (i10 == 0 || iArr.length == 0) {
            this.f666c = mVar;
        }
        int[][] iArr2 = (int[][]) this.f667d;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            ?? r32 = new int[i11][];
            System.arraycopy(iArr2, 0, r32, 0, i10);
            this.f667d = r32;
            ?? r12 = new ef.m[i11];
            System.arraycopy((ef.m[]) this.f668e, 0, r12, 0, i10);
            this.f668e = r12;
        }
        int[][] iArr3 = (int[][]) this.f667d;
        int i12 = this.f665b;
        iArr3[i12] = iArr;
        ((ef.m[]) this.f668e)[i12] = mVar;
        this.f665b = i12 + 1;
    }

    public n b() {
        if (((String) this.f666c) == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (((String) this.f669f) != null) {
            return new n(this);
        }
        throw new IllegalStateException("host == null");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ef.m[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void c() {
        this.f666c = new ef.m();
        this.f667d = new int[10][];
        this.f668e = new ef.m[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(ak.n r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.m.d(ak.n, java.lang.String):void");
    }

    public String toString() {
        switch (this.f664a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                String str = (String) this.f666c;
                if (str != null) {
                    sb2.append(str);
                    sb2.append("://");
                } else {
                    sb2.append("//");
                }
                if (!((String) this.f667d).isEmpty() || !((String) this.f668e).isEmpty()) {
                    sb2.append((String) this.f667d);
                    if (!((String) this.f668e).isEmpty()) {
                        sb2.append(':');
                        sb2.append((String) this.f668e);
                    }
                    sb2.append('@');
                }
                String str2 = (String) this.f669f;
                if (str2 != null) {
                    if (str2.indexOf(58) != -1) {
                        sb2.append('[');
                        sb2.append((String) this.f669f);
                        sb2.append(']');
                    } else {
                        sb2.append((String) this.f669f);
                    }
                }
                int iB = this.f665b;
                if (iB != -1 || ((String) this.f666c) != null) {
                    if (iB == -1) {
                        iB = n.b((String) this.f666c);
                    }
                    String str3 = (String) this.f666c;
                    if (str3 == null || iB != n.b(str3)) {
                        sb2.append(':');
                        sb2.append(iB);
                    }
                }
                ArrayList arrayList = (ArrayList) this.f671h;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append('/');
                    sb2.append((String) arrayList.get(i10));
                }
                if (((ArrayList) this.f672i) != null) {
                    sb2.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f672i;
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11 += 2) {
                        String str4 = (String) arrayList2.get(i11);
                        String str5 = (String) arrayList2.get(i11 + 1);
                        if (i11 > 0) {
                            sb2.append('&');
                        }
                        sb2.append(str4);
                        if (str5 != null) {
                            sb2.append('=');
                            sb2.append(str5);
                        }
                    }
                }
                if (((String) this.f670g) != null) {
                    sb2.append('#');
                    sb2.append((String) this.f670g);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public m(int i10) {
        this.f664a = i10;
        switch (i10) {
            case 1:
                break;
            default:
                this.f667d = "";
                this.f668e = "";
                this.f665b = -1;
                ArrayList arrayList = new ArrayList();
                this.f671h = arrayList;
                arrayList.add("");
                break;
        }
    }
}
