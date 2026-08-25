public class SmallestMissingMultiple {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) { // colocando todos os numeros em um Set
            seen.add(num);
        }
        int cur = k;
        while (seen.contains(cur)) { // enquanto nao tiver o cur dentro do Set seen, continue somando "k" ao cur, até que se tenha o menor valor multiplo desconhecido em seen.
            cur += k;
        }
        return cur;
    }
}