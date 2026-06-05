package rg;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements ug.d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14380a;

    public a(HashMap map) {
        this.f14380a = map;
    }

    public void a(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = this.f14380a;
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i10 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = t7.f.f16113b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i10 < zArr.length) {
                            boolArr[i10] = Boolean.valueOf(zArr[i10]);
                            i10++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = t7.f.f16113b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i10 < bArr.length) {
                            bArr2[i10] = Byte.valueOf(bArr[i10]);
                            i10++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = t7.f.f16113b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i10 < iArr.length) {
                            numArr[i10] = Integer.valueOf(iArr[i10]);
                            i10++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = t7.f.f16113b;
                        Long[] lArr = new Long[jArr.length];
                        while (i10 < jArr.length) {
                            lArr[i10] = Long.valueOf(jArr[i10]);
                            i10++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = t7.f.f16113b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i10 < fArr.length) {
                            fArr2[i10] = Float.valueOf(fArr[i10]);
                            i10++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = t7.f.f16113b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i10 < dArr.length) {
                            dArr2[i10] = Double.valueOf(dArr[i10]);
                            i10++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public void b(wg.c cVar) {
        int i10 = cVar.f19292a;
        zg.l lVar = cVar.f19293b;
        zg.c cVar2 = cVar.f19295d;
        ug.l.b("Only child changes supported for tracking", i10 == 2 || i10 == 4 || i10 == 1);
        ug.l.c(!cVar2.equals(zg.c.f20591d));
        HashMap map = this.f14380a;
        if (!map.containsKey(cVar2)) {
            map.put(cVar2, cVar);
            return;
        }
        wg.c cVar3 = (wg.c) map.get(cVar2);
        int i11 = cVar3.f19292a;
        zg.l lVar2 = cVar3.f19294c;
        if (i10 == 2 && i11 == 1) {
            map.put(cVar2, new wg.c(4, lVar, cVar2, cVar3.f19293b));
            return;
        }
        if (i10 == 1 && i11 == 2) {
            map.remove(cVar2);
            return;
        }
        if (i10 == 1 && i11 == 4) {
            map.put(cVar2, new wg.c(1, lVar2, cVar2, null));
            return;
        }
        if (i10 == 4 && i11 == 2) {
            map.put(cVar2, new wg.c(2, lVar, cVar2, null));
            return;
        }
        if (i10 == 4 && i11 == 4) {
            map.put(cVar2, new wg.c(4, lVar, cVar2, lVar2));
            return;
        }
        throw new IllegalStateException("Illegal combination of changes: " + cVar + " occurred after " + cVar3);
    }

    @Override // ug.d
    public Object i(h hVar, Object obj, Object obj2) {
        zg.r rVar = (zg.r) obj;
        int i10 = hVar.f14416b;
        String string = "/";
        if (!hVar.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = i10; i11 < hVar.f14417c; i11++) {
                if (i11 > i10) {
                    sb2.append("/");
                }
                sb2.append(hVar.f14415a[i11].f20592a);
            }
            string = sb2.toString();
        }
        this.f14380a.put(string, rVar.s(true));
        return null;
    }

    public a(int i10) {
        switch (i10) {
            case 2:
                this.f14380a = new HashMap();
                break;
            default:
                this.f14380a = new HashMap();
                break;
        }
    }
}
