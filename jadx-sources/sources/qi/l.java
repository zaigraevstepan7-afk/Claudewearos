package qi;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class l extends q {
    public static Object A0(List list) {
        fj.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object B0(int i10, List list) {
        fj.l.f(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final void C0(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ej.c cVar) {
        fj.l.f(iterable, "<this>");
        sb2.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb2.append(charSequence);
            }
            yd.f.f(sb2, obj, cVar);
        }
        sb2.append(charSequence3);
    }

    public static /* synthetic */ void D0(List list, StringBuilder sb2, String str, ej.c cVar, int i10) {
        if ((i10 & 64) != 0) {
            cVar = null;
        }
        C0(list, sb2, str, "", "", "...", cVar);
    }

    public static String E0(Iterable iterable, CharSequence charSequence, String str, String str2, ej.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i10 & 2) != 0 ? "" : str;
        String str4 = (i10 & 4) != 0 ? "" : str2;
        if ((i10 & 32) != 0) {
            cVar = null;
        }
        fj.l.f(iterable, "<this>");
        fj.l.f(charSequence2, "separator");
        fj.l.f(str3, "prefix");
        StringBuilder sb2 = new StringBuilder();
        C0(iterable, sb2, charSequence2, str3, str4, "...", cVar);
        return sb2.toString();
    }

    public static Object F0(List list) {
        fj.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(yd.f.B(list));
    }

    public static Object G0(List list) {
        fj.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable H0(List list) {
        fj.l.f(list, "<this>");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList I0(Collection collection, List list) {
        fj.l.f(collection, "<this>");
        fj.l.f(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static ArrayList J0(List list, Object obj) {
        fj.l.f(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static List K0(Iterable iterable) {
        fj.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listU0 = U0(iterable);
            if (((ArrayList) listU0).size() > 1) {
                Collections.sort(listU0);
            }
            return listU0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return R0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        fj.l.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return k.c0(array);
    }

    public static List L0(Comparator comparator, Iterable iterable) {
        fj.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listU0 = U0(iterable);
            p.t0(listU0, comparator);
            return listU0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return R0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        fj.l.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return k.c0(array);
    }

    public static List M0(Iterable iterable, int i10) {
        fj.l.f(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.e(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.f13520a;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return R0(iterable);
            }
            if (i10 == 1) {
                return yd.f.K(y0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return yd.f.T(arrayList);
    }

    public static List N0(int i10, List list) {
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.e(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.f13520a;
        }
        int size = list.size();
        if (i10 >= size) {
            return R0(list);
        }
        if (i10 == 1) {
            return yd.f.K(F0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] O0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            bArr[i10] = ((Number) obj).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void P0(Iterable iterable, AbstractCollection abstractCollection) {
        fj.l.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] Q0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            iArr[i10] = ((Number) obj).intValue();
            i10++;
        }
        return iArr;
    }

    public static List R0(Iterable iterable) {
        fj.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return yd.f.T(U0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.f13520a;
        }
        if (size != 1) {
            return T0(collection);
        }
        return yd.f.K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] S0(List list) {
        fj.l.f(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static ArrayList T0(Collection collection) {
        fj.l.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List U0(Iterable iterable) {
        fj.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return T0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        P0(iterable, arrayList);
        return arrayList;
    }

    public static Set V0(Iterable iterable) {
        fj.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(v.g0(collection.size()));
                    P0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                fj.l.e(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            P0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                fj.l.e(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return u.f13522a;
    }

    public static boolean w0(Iterable iterable, Object obj) {
        int iIndexOf;
        fj.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i10 < 0) {
                    yd.f.i0();
                    throw null;
                }
                if (fj.l.b(obj, next)) {
                    iIndexOf = i10;
                    break;
                }
                i10++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List x0(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return s.f13520a;
        }
        if (size == 1) {
            return yd.f.K(F0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i10 = 1; i10 < size2; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object y0(Iterable iterable) {
        fj.l.f(iterable, "<this>");
        if (iterable instanceof List) {
            return z0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object z0(List list) {
        fj.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }
}
