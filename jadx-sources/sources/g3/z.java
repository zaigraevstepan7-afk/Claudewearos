package g3;

import android.content.Context;
import c1.v7;
import c2.v0;
import com.google.android.gms.internal.ads.zzbch;
import java.io.File;
import k0.p1;
import lb.q3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7194a;

    public /* synthetic */ z(int i10) {
        this.f7194a = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws e8.b {
        int length;
        int iH0;
        int i10 = this.f7194a;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                s1.a aVar = (s1.a) obj;
                f0 f0Var = (f0) obj2;
                c2.w wVar = new c2.w(f0Var.f7084a.a());
                c0 c0Var = d0.f7063p;
                Object objA = d0.a(wVar, c0Var, aVar);
                s3.o oVar2 = new s3.o(f0Var.f7085b);
                c0 c0Var2 = d0.f7069v;
                Object objA2 = d0.a(oVar2, c0Var2, aVar);
                k3.s sVar = f0Var.f7086c;
                k3.s sVar2 = k3.s.f9395b;
                Object objA3 = d0.a(sVar, d0.f7060m, aVar);
                Object objA4 = d0.a(f0Var.f7087d, d0.f7067t, aVar);
                Object objA5 = d0.a(f0Var.f7088e, d0.f7068u, aVar);
                String str = f0Var.f7090g;
                Object objA6 = d0.a(new s3.o(f0Var.f7091h), c0Var2, aVar);
                Object objA7 = d0.a(f0Var.f7092i, d0.f7061n, aVar);
                Object objA8 = d0.a(f0Var.j, d0.f7058k, aVar);
                n3.b bVar = f0Var.f7093k;
                n3.b bVar2 = n3.b.f11896c;
                Object objA9 = d0.a(bVar, d0.f7072y, aVar);
                Object objA10 = d0.a(new c2.w(f0Var.f7094l), c0Var, aVar);
                Object objA11 = d0.a(f0Var.f7095m, d0.j, aVar);
                v0 v0Var = f0Var.f7096n;
                v0 v0Var2 = v0.f3048d;
                break;
            case 1:
                s1.a aVar2 = (s1.a) obj;
                l0 l0Var = (l0) obj2;
                f0 f0Var2 = l0Var.f7134a;
                qh.c cVar = d0.f7056h;
                break;
            case 2:
                v vVar = (v) obj2;
                Boolean boolValueOf = Boolean.valueOf(vVar.f7188a);
                qh.c cVar2 = d0.f7049a;
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                r3.s sVar3 = (r3.s) obj2;
                break;
            case 6:
                break;
            case 7:
                cl.a aVar3 = (cl.a) obj;
                fj.l.f(aVar3, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                h9.a aVar4 = new h9.a(0);
                tj.i0.a(0, 7, null);
                break;
            case 8:
                cl.a aVar5 = (cl.a) obj;
                fj.l.f(aVar5, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                Context contextJ = hj.a.j(aVar5);
                i9.a aVar6 = new i9.a();
                File cacheDir = contextJ.getCacheDir();
                fj.l.e(cacheDir, "getCacheDir(...)");
                File file = new File("icons");
                String path = file.getPath();
                fj.l.e(path, "getPath(...)");
                char c6 = File.separatorChar;
                int iH02 = nj.e.H0(path, c6, 0, 4);
                if (iH02 != 0) {
                    length = (iH02 <= 0 || path.charAt(iH02 + (-1)) != ':') ? (iH02 == -1 && nj.e.E0(path, ':')) ? path.length() : 0 : iH02 + 1;
                } else if (path.length() <= 1 || path.charAt(1) != c6 || (iH0 = nj.e.H0(path, c6, 2, 4)) < 0) {
                    length = 1;
                } else {
                    int iH03 = nj.e.H0(path, c6, iH0 + 1, 4);
                    length = iH03 >= 0 ? iH03 + 1 : path.length();
                }
                if (!(length > 0)) {
                    String string = cacheDir.toString();
                    fj.l.e(string, "toString(...)");
                    if (!(string.length() == 0) && !nj.e.E0(string, c6)) {
                        new File(string + c6 + file);
                        break;
                    } else {
                        new File(string + file);
                        break;
                    }
                }
                break;
            case 9:
                break;
            case 10:
                cl.a aVar7 = (cl.a) obj;
                fj.l.f(aVar7, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 11:
                cl.a aVar8 = (cl.a) obj;
                fj.l.f(aVar8, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 12:
                ((Integer) obj2).getClass();
                jb.c.a(f1.s.O(7), (f1.i0) obj);
                break;
            case 13:
                ((Integer) obj2).getClass();
                jb.c.a(f1.s.O(7), (f1.i0) obj);
                break;
            case 14:
                p1 p1Var = (p1) obj2;
                break;
            case 15:
                fj.l.f((cl.a) obj, "$this$factory");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 16:
                cl.a aVar9 = (cl.a) obj;
                fj.l.f(aVar9, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 17:
                cl.a aVar10 = (cl.a) obj;
                fj.l.f(aVar10, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 18:
                cl.a aVar11 = (cl.a) obj;
                fj.l.f(aVar11, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 19:
                cl.a aVar12 = (cl.a) obj;
                fj.l.f(aVar12, "$this$factory");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 20:
                fj.l.f((cl.a) obj, "$this$factory");
                fj.l.f((yk.a) obj2, "it");
                break;
            case zzbch.zzt.zzm /* 21 */:
                cl.a aVar13 = (cl.a) obj;
                fj.l.f(aVar13, "$this$viewModel");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 22:
                cl.a aVar14 = (cl.a) obj;
                fj.l.f(aVar14, "$this$factory");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 23:
                cl.a aVar15 = (cl.a) obj;
                fj.l.f(aVar15, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 24:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    v7.a("Restart required", null, 0L, 0L, k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1572870, 0, 262078);
                    break;
                }
            case 25:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                    break;
                } else {
                    q3.o(0, i0Var2);
                    break;
                }
            case 26:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i0Var3.W();
                    break;
                } else {
                    v7.a("Restart required", null, 0L, 0L, k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 1572870, 0, 262078);
                    break;
                }
            case 27:
                f1.i0 i0Var4 = (f1.i0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    i0Var4.W();
                    break;
                } else {
                    v7.a("tiny ad jumpscare", null, 0L, 0L, k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 1572870, 0, 262078);
                    break;
                }
            case 28:
                f1.i0 i0Var5 = (f1.i0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    i0Var5.W();
                    break;
                } else {
                    v7.a("To change graphic you need to watch an AD. IK IK it's annoying but... all the servers and everything cost a LOT of money, so I put ads so I get money. Oki, thanks.", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var5, 6, 0, 262142);
                    break;
                }
            default:
                f1.i0 i0Var6 = (f1.i0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!i0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    i0Var6.W();
                    break;
                } else {
                    q3.o(0, i0Var6);
                    break;
                }
        }
        return oVar;
    }

    public /* synthetic */ z(int i10, int i11) {
        this.f7194a = i11;
    }
}
