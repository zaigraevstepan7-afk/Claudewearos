package b4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final o f1544d;

    /* renamed from: f, reason: collision with root package name */
    public int f1546f;

    /* renamed from: g, reason: collision with root package name */
    public int f1547g;

    /* renamed from: a, reason: collision with root package name */
    public o f1541a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1542b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1543c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1545e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f1548h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f1549i = null;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1550k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1551l = new ArrayList();

    public f(o oVar) {
        this.f1544d = oVar;
    }

    @Override // b4.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f1551l;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (!((f) obj).j) {
                return;
            }
        }
        this.f1543c = true;
        o oVar = this.f1541a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f1542b) {
            this.f1544d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.j) {
            g gVar = this.f1549i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                } else {
                    this.f1546f = this.f1548h * gVar.f1547g;
                }
            }
            d(fVar.f1547g + this.f1546f);
        }
        o oVar2 = this.f1541a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f1550k.add(oVar);
        if (this.j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f1551l.clear();
        this.f1550k.clear();
        this.j = false;
        this.f1547g = 0;
        this.f1543c = false;
        this.f1542b = false;
    }

    public void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f1547g = i10;
        ArrayList arrayList = this.f1550k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1544d.f1566b.f114g0);
        sb2.append(":");
        switch (this.f1545e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.j ? Integer.valueOf(this.f1547g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f1551l.size());
        sb2.append(":d=");
        sb2.append(this.f1550k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
